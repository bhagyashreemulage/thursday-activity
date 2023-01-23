package com.que3;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1="I am working on java";
		System.out.println(s1);
		
		System.out.println("enter the string");
		String s2=sc.nextLine();
		
		System.out.println("after removing the duplicate characters:");
		sc.close();
		for(int  i=0;i<s1.length();i++)
		{
			boolean b=false;
			for(int j=0;j<s2.length();j++)
			{
	if(Character.toLowerCase(s1.charAt(i))==Character.toLowerCase(s2.charAt(j)))
	{
					b=true;
				break;
			}
		}
		if(b==false)
		{
			
		System.out.println(s1.charAt(i));
		}
		}

	}

}

