package com.question3;

import java.util.Scanner;

public class Customer {
	private String Accno;  
    private String name;  
    private int accbal;  
    Scanner sc = new Scanner(System.in);
    
  // entering the customer details   
    public void createAccount()
    {  
        System.out.print("Enter Account no ");  
        Accno =sc.next();  
        System.out.print("Enter Name");  
        name = sc.next();  
        System.out.print("Enter acc Balance");  
        accbal = sc.nextInt(); 
    }
    //adding amount
   public void setAmount() {
      int amount;
      System.out.print("Enter the amount you want to add ");  
      amount=sc.nextInt(); 
      accbal =(accbal+amount); 


	  System.out.println("Blance after entering amount is "+accbal);
	
}


   public void getAmount()
{
	  System.out.println(" the account balance is  " +accbal);
	  System.out.println(" the name of account is "+name);
}
   public void withDrawAmount() {
      int withdraw;
      System.out.print("Enter the amount you want to withdraw ");  
      withdraw=sc.nextInt();

      accbal=(accbal-withdraw);

      System.out.println(" the amount after withdraw is"+accbal);

}

}

public class CustomerMain {

	public static void main(String[] args) {
		Customer cr=new Customer();//details of 1 customer
		cr.createAccount();
		cr.setAmount();
		cr.getAmount();
		cr.withDrawAmount();
		System.out.println("enter the details of  2 customer is ");
		Customer cr2=new Customer();//details of 2 customer
		cr2.createAccount();
		cr2.setAmount();
		cr2.getAmount();
		cr2.withDrawAmount();
	

	}

}
