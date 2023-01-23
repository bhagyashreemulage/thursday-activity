//Author:Bhagyashree mulage
//WAP to search an element in an array
package que6;

import java.util.Scanner;

public class SearchArrayElement{
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,n,search,flag=0;
		
	System.out.println("Enter the number of elements:") ;
		n = sc.nextInt(); //taking the number from user  
	int[] a = new int[n];

		System.out.println("Enter the elements") ;
		for(i=0;i<n;i++)
		{
    		a[i] = sc.nextInt();  //taking the elements from user
		}
	
	System.out.println("Enter the element to be seached");
	search = sc.nextInt();		//searching element that want to take from user

		/*Perform search operation*/
		for(i=0;i<n;i++)
		{
    		if(a[i]==search)		//if the search element found
    		{
        			System.out.println("Element "+search+" found at "+i+" position");
        			flag=1;
        			break;
    		}
		}
		if(flag==0)    //if the search element not found
		{
    		System.out.println("Element "+search+" not found");
		}
}

}
