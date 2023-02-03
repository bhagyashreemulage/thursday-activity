package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private long empId;
	private String name;
	private double salary;
	
	Address address;

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}

}
