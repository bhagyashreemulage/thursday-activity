//Author:Bhagyashree mulage
 //Program to print first and last digit of a number
package que1;

public class FirstandLastDigit {
	public static void main(String[] args) {
		int number=502356997;
	    int firstDigit = 0;
	    int lastDigit = 0;

	    lastDigit = number%10;		//for last digit
	    
	    while (number != 0) // To find the first digit of the number
	    {
	      firstDigit=number % 10;		
	      number /= 10;
	    }
	      
	    System.out.println("The First digit of the given number is: " + firstDigit);
	    System.out.println("The Last digit of the given number is: " + lastDigit);
	}


}
