package com.que3;

public class StringOperations {
public static void main(String[] args) {
		
		
		
		String s1=new String("bhagyashree@is@good@girl");
		String s2=new String("omkar");
		String s3="SHRUTI";
		String s4="ankita";
		
		System.out.println(s1.charAt(0));				//print the character at given position position
		System.out.println(s3.compareTo(s4));			//comparing two strings
		System.out.println(s1.concat(s2));			//here actual string concat perform
		System.out.println("------------------------");
		System.out.println(s1.indexOf("t"));		//Returns the index within this string.
		System.out.println(s1.replaceAll("bhagyashree@is@good@girl","bhagya is beautiful girl"));	
		
		System.out.println(s1.substring(12));			
		System.out.println(s3.toLowerCase());	//convert upper case letter to lower case
		
		

	}

}


