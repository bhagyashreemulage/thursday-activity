//Author:Bhagyashree mulage
//WAP to reverse an array
package que3;

public class ReverseArray {
	public static void main(String[] args)
	{
		 int [] arr = new int [] {1, 2, 3, 4, 5};  
		 
	        System.out.println("Original array: ");  
	        
	        for (int i = 0; i < arr.length; i++) 
	        {  
	            System.out.print(arr[i] + " ");  //printing the original array
	        }  
	        
	        System.out.println(); 
	        
	        System.out.println("Array in reverse order: ");  
	       
	        
	        for (int i = arr.length-1; i >= 0; i--) //Loop for the array in reverse order  
	        {  
	            System.out.print(arr[i] + " ");  //printing the reverse array

	}

}

}
