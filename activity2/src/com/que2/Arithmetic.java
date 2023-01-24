package com.que2;

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




