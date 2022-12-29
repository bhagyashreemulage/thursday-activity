//Author:Bhagyashree Mulage
package com.que3;

import java.util.Iterator;
import java.util.TreeSet;

public class ColorSet {
	//1.adding colors and print out the tree set.
	public static void main(String[] args) {
		TreeSet<String> co=new TreeSet<>();
		co.add("Orange");				
		co.add("Green");		
		co.add("Yellow");
		co.add("Brown");
		for(String s:co)
		{
			System.out.println(s);
			
		}
		System.out.println("-----------------------------");
		//2.adding all the elements one set to another set.
		TreeSet<String> co1=new TreeSet<>();
		co1.addAll(co);
		System.out.println("-----------------------------");
		//3.creating a reverse order
		Iterator<String> itr=co1.descendingIterator();    
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
		System.out.println("-----------------------------");
		//4.comparing the first tree set to second tree set.
		System.out.println(co1.equals(co));		
		System.out.println("-------------------------------------");
		//5.Get the first and the last elements in a tree set.
		System.out.println("to get first element "+co1.pollFirst());			
		System.out.println("To get Last element "+co1.pollLast());		 
	

	}

}
