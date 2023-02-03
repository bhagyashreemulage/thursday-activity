package com.test.servicetest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.test.entity.Address;
import com.test.entity.Employee;
import com.test.exception.GlobalException;
import com.test.service.EmployeeService;

@TestMethodOrder(value=OrderAnnotation.class)
public class EmployeeServiceTest {
	static EmployeeService employeeService;
	static List<Employee> empList;
	
	@BeforeEach
	void setUp() throws Exception
	{
		employeeService=new EmployeeService();
		
	}
	
	@AfterEach
	void tearDown() throws Exception
	{
		employeeService=null;
		System.out.println("objetc is garbage collected !!");	
	}
	
	@Test
	@Order(1)		//giving order to the test which we want the test to display	
	@DisplayName("Testing add employee method")
	void testAddEmployee()
	{
		//way 1
	//	employeeService.addEmployee(123,"Bhagyashree",55000,"pune","india");
		//employeeService.addEmployee(124,"snehal",25000,"pune","india");
		//assertEquals(2,employeeService.lengthOfList());
	
		//way 2
		Address add=Address.builder().city("pune").country("india").build();
		Employee emp=Employee.builder().empId(123).
				name("shruti").salary(5000).address(add).build();
		employeeService.addEmp(emp);
		int length=employeeService.lengthOfList();
		//employeeService.displayAllEmployee();
		assertThat(length>0).isTrue();
	}
	
	@Test
	@Order(3)
	@DisplayName("Testing display employee by Id")
	void testDisplayByEmpId() throws GlobalException{
		Address add=Address.builder().city("pune").country("india").build();
		Employee emp=Employee.builder().empId(123).
				name("shruti").salary(50000).address(add).build();
		employeeService.addEmp(emp);
		Employee e=employeeService.displayEmpById(123);
		//assertEquals("shruti", e.getName());
		assertThat(e.getSalary()).isEqualByComparingTo(25000.00);
	}
		
		@Test
		@Order(2)
		@DisplayName("Testing update employee")
		void testUpdateEmployee()
		{
			Address add=Address.builder().city("pune").country("india").build();
			Employee emp=Employee.builder().empId(123).
					name("shruti").salary(50000).address(add).build();
			employeeService.addEmp(emp);
			Employee e=employeeService.findId(123);
			e.setName("omkar");
			employeeService.UpdateEmp(0, e);		//updating the employee details
			employeeService.displayAllEmployee();
			//assertEquals("omkar", e.getName());
			assertThat(e.getName()).isEqualTo("omkar");	
		}
		@Test
		@Order(4)
		@DisplayName("Removing the employee by Id")
		void testRemoveById()
		{
			Address add=Address.builder().city("pune").country("india").build();
			Employee emp=Employee.builder().empId(101).
					name("shruti").salary(50000).address(add).build();
			employeeService.addEmp(emp);
			employeeService.displayAllEmployee();		
			System.out.println("Id is removed");
			employeeService.RemoveId(101);//removing data by Id
			//assertEquals("shruti", employeeService.findId(101).getName());
			assertNull(employeeService.findId(101));
			employeeService.displayAllEmployee();
			
		}
		@Test
		@Order(5)
		@DisplayName("Deleting all employee details")
		void testDeleteAllDetails()
		{
			employeeService.RemoveAlllemployee();		//removing all the details of employee
			System.out.println("All details of employee  are removed");
			employeeService.displayAllEmployee();
		}
		@Test
		void testCalculateYearSalary()
		{
			Address add=Address.builder().city("pune").country("india").build();
			Employee emp=Employee.builder().empId(145).name("bhagyashree").salary(50000).address(add)
					.build();
			employeeService.addEmp(emp);
			double sal=employeeService.calculateYearSalary(145);
			assertEquals(360000, sal);
		}
		@Test
		void testApperasal()
		{
			Address add=Address.builder().city("pune").country("india").build();
			Employee emp=Employee.builder().empId(145).name("bhagyashree").salary(50000).address(add)
					.build();
			employeeService.addEmp(emp);
			double apparasal=employeeService.calculateApparasal(145);
			assertEquals(2500,apparasal);
			
			
		}
	}