package com.que1;

import java.util.Scanner;

class  ReverseNumber
{
	public void reverse()					//method for reverse number
	{
		System.out.println("enetr the number to reverse:");
		 Scanner sc = new Scanner(System.in);			//taking user input by using scanner class
		int number=sc.nextInt();		
				
		int reverse=0;
		
		while(number!=0)
		{
			int remainder=number%10;				//logic for reverse number
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println("The reverse of the given no is:"+reverse);		//printing the reverse number
		
		sc.close();
	}
}

class Sum extends ReverseNumber			//here class is extending 
{
	public void sumdigit()			//method to find sum of digit
	{
		System.out.println("Enter the number to find sum");
		Scanner sc=new Scanner(System.in);			//taking user input by using scanner class
		int number=sc.nextInt();
		
		int sum=0,digit;
		
		while(number>0)		
		{
			digit=number%10;					//logic for sum of digit number
			sum=sum+digit;
			number=number/10;
			
		}
		System.out.println("sum of digit is"+sum);
		sc.close();
	}
}

public class InheritanceOutput extends Sum {
public static void main(String[] args) {
		
		Sum s=new Sum();				//creating the object for memory allocation
		
		s.sumdigit();					//sum method is calling
		s.reverse();					//calling the reverse method
	

	}

	

}


