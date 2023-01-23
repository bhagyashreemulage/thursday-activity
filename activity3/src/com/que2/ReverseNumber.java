package com.que2;

import java.util.Scanner;

public class ReverseNumber {
	public void reverseNo()
	{
		int reminder;
		int reverseNo=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter an number to reverse");
			
			int num=sc.nextInt();
			while(num!= 0)
			{
				reminder=num%10;
				reverseNo=reverseNo*10+reminder;
				num= num/10;
			}
		} 
	    System.out.println("Reverse of the number is " +reverseNo);
	  }

}


