/*Q4)Bank - Savings Account and Current Account
Write classes to hold Account, SB-Account and Current-Account
details. [Here implement the concept of inheritance.]
The common properties of the account are Account number,
name and amount.
Specifics of SB account is 4% interest to be paid per month.
Implement the run-time polymorphism by creating base class variable
and derived class object. Ask the user for which type of account
to be created then create the corresponding account
(Note: Use scanner class).
Implement function overriding by having deposit and withdraw
functions and perform the required action accordingly.Ensure
base class can t be instantiated. (Note: Abstract keyword can be used).

2)
Define the minimum balance for the both the type of accounts.
Use final keyword to create constants.  
Ensure sb account class and current account class will not be
used as base classes (Note: You can use final classes).
*/
package com.nt;

public abstract class Bank{
   protected int AccountNumber;
   protected String name;
   protected double amount;
   
   public Bank(int accountNumber, String name, double amount) {
	   this.AccountNumber = accountNumber;
       this.name = name;
       this.amount = amount;
   }
   public int getAccountNumber() {
	return AccountNumber;
   }
   public void setAccountNumber(int accountNumber) {
	AccountNumber = accountNumber;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public double getAmount() {
	return amount;
   }
   public void setAmount(double amount) {
	this.amount = amount;
   }
   
   public abstract void deposit(double amt) throws InvalidAmountException;
   
   public abstract void withdraw(double amt) throws InsufficientFundException;
   
   public abstract void display();
}

class InvalidAmountException extends Exception{}
class InsufficientFundException extends Exception{}