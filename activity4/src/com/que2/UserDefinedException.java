package com.que2;
import java.util.Scanner;

class  InvalidAgeWeightException extends Throwable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeWeightException() {
		super();
	} 	
}

public class UserDefinedException {
	float weight;
	int age;
	
	public UserDefinedException(float weight, int age) {
	
		this.weight = weight;					///generating constructor using this keyword
		this.age = age;
		try
		{
			if(age<18 || weight<50)						//checking the condition
			{
				throw new InvalidAgeWeightException();			//throwing custom define exception
				
			
			}
		}
		catch(InvalidAgeWeightException i)					//catching the exception thrown by the try block
		{
			System.out.println(i);
		}
	}
	void display()
	{
		System.out.println("weight of the person is "+weight);			//printing the weight
		System.out.println("age of the person is "+age);				//printing the age
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the person weight");						//taking the user input  as weight
		float weight=sc.nextFloat();
		System.out.println("Enter the person age");							//taking the user input  as age
		int age=sc.nextInt();
		
		UserDefinedException c=new UserDefinedException(weight,age);			//making object
		c.display();									//calling the method

	}




}
