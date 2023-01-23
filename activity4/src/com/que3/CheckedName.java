package com.que3;
import java.util.Scanner;
import javax.naming.InvalidNameException;

public  class CheckedName extends Exception
{
		void validateName(String name) throws InvalidNameException
		{
			String[] names= {"Ankita","Rutuja","Vanitha","Anjali"};			//passing array name
			boolean found=false;		
			for(String n: names)
			{
				if(n.equalsIgnoreCase(name))					//ignores whether the letter is lowercase or uppercase	
				{
					found=true;
					break;
				}
			}
			if(found)
			{
				System.out.println("the name is valid");			//if name found same 
			}
			else
			{
				throw new InvalidNameException("Invalid name,please try again");		//if name not found 
			}
		}
	public static void main(String[] args)
	{
		CheckedName uk=new CheckedName();			//creating the objetc
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the name");
				String name=sc.next();				//taking user input
				try
				{
					uk.validateName(name);				//throwing exception
					}
				catch(InvalidNameException e)				//catch the exception
				{
					System.out.println("Invalid name");
				}
				}
}