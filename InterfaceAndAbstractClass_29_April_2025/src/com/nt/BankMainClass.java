package com.nt;

import java.util.Scanner;

public class BankMainClass {
  public static void main(String[] args) 
		  throws InvalidAmountException,
		  InsufficientFundException {
	Scanner sc=new Scanner(System.in);
	Bank b1;
	
	System.out.println("Enter account type::");
    int type = sc.nextInt();

    System.out.print("Enter Account Number: ");
    int accNo = sc.nextInt();
    sc.nextLine(); 
    
    System.out.print("Enter Account Holder Name: ");
    String name = sc.nextLine();
    
    System.out.print("Enter Initial Amount: ");
    double amount = sc.nextDouble();

	if (type == 1) {
    	b1 = new SB_Account(accNo, name, amount);
    } else if (type == 2) {
    	b1 = new Current_Account(accNo, name, amount);
    } else {
        System.out.println("Invalid account type.");
        sc.close();
        return;
    }

    System.out.print("Enter amount to deposit: ");
    double dep = sc.nextDouble();
    b1.deposit(dep);

    b1.display();
    System.out.println();
    
    System.out.print("Enter amount to withdraw: ");
    double with = sc.nextDouble();
    b1.withdraw(with);

    b1.display();
    sc.close();
}
}
