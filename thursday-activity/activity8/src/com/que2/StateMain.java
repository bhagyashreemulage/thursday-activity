package com.que2;
import java.util.Iterator;

public class StateMain {
	public static void main(String[] args) {
		State a=new State();
		a.addState("Karnataka");			//adding sate name
		a.addState("Maharashra");
		a.addState("Panjab");
		a.addState("Gujarat");
		
		System.out.println("Retrive the details of state:"+a.retriveState("Kerla"));		//Retrieves the specific state name 

	}

}
