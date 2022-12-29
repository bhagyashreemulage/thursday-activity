//Author:Bhagyashree Mulage
package com.que2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapForNum {
	public static void main(String[] args) {
		TreeMap<Integer,Integer> map=new TreeMap<>();
		for(int i=1;i<=20;i++)
		{
			map.put(i, i*i);
		}
		for(Map.Entry e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());		
		}
		TreeMap<Integer,Integer> map1=new TreeMap<>();
		System.out.println("-----------------------------------------");
		//1.copy a 1st treeMap content to another TreeMap content
		map1.putAll(map);			
		System.out.println(map1);
		System.out.println("-----------------------------------------");
		//2.searching a key in a treeMap
		System.out.println("To  search for a specific key :"+map.containsKey(7));
		System.out.println("-----------------------------------------");
		//3.searching a Value in a treeMap
		System.out.println("To search a specific value in key: "+map.containsValue(9));		
		System.out.println("-----------------------------------------");
		//4.to get a greatest key
		System.out.println("To find greatest key "+map.higherKey(19));	
		System.out.println("-----------------------------------------");
		//5.to get and remove least key
		System.out.println(map.pollFirstEntry());
		System.out.println("-----------------------------------------");
		//6.to get and remove last key
		System.out.println(map.pollLastEntry());			
		System.out.println(map);
		
				
	}

}
