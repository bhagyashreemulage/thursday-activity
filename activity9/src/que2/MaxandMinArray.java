//Author:Bhagyashree mulage
// Program to print max and min element of an array
package que2;

import java.util.Arrays;

public class MaxandMinArray {
	public static void main(String[] args) {
		int a[]={5,100,6,46,34,23,13,53,4};
       
      Arrays.sort(a);			//sorting the element 
        
      System.out.println("minimum value is:"+a[0]);
      System.out.println(" maximum value is :"+a[a.length-1]);
	}

}
