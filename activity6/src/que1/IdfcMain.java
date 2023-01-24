//Author:Bhagyashree mulage
//password contain 8 characters one uppercase, one lowercase, one special character
package que1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdfcMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password:");		//taking user input for password
		String password=sc.next();
		String regex="[A-Za-z#@*]{8}";		//checking for the uppercase,lowercase letter and also range
		Pattern p=Pattern.compile(regex);		//define pattern for regex
		Matcher m=p.matcher(password);		//perform match operation
		boolean matchFound=m.find();		///finding the matching characters
		if(matchFound)
		{
			System.out.println("password is valid");
		}
		else {
			System.out.println("Invalid password....please try again");
		}
	}
}