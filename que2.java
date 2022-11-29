package com.question2;

public class Arithmetic {
	int add(int a,int b)
	{
		int sum=a+b;
		return(sum);
	}

}
class Adder extends Arithmetic
{
	public int addition(int a, int b)
	{
		return add(a,b);
	}
}


public class ArithmeticMain {

	public static void main(String[] args) {
		Adder a=new Adder();	
		a.addition(20,30);		
	System.out.println(a.addition(10,10)+" "+a.addition(2,3)+" ");
	
	
	}

}
