package com.nt;

public class SB_Account extends Bank {
	private static final double INTEREST_RATE = 0.04;
    private static final double MIN_BALANCE = 1000;
 
	public SB_Account(int accountNumber, String name, double amount) {
		super(accountNumber, name, amount);
		if (amount < MIN_BALANCE) {
            System.out.println("Opening balance must be at least: " + MIN_BALANCE);
            this.amount = MIN_BALANCE;
        }
	}

	@Override
	public void deposit(double amt) throws InvalidAmountException{
		   if(amt>0) {
			   this.setAmount(getAmount()+amt);
			   System.out.println("Deposit is Successful to "+getAccountNumber()+" AccountNumber");
		   }
		   else{
			   throw new InvalidAmountException();
		   }
	   }
	   
	   @Override
	   public void withdraw(double amt) throws InsufficientFundException{
		   if(amt<=getAmount()) {
			   this.setAmount(getAmount()-amt);
			   System.out.println("Withdraw is Successful from "+getAccountNumber()+" AccountNumber");
		   }
		   else{
			   throw new InsufficientFundException();
		   }
	   }
	   
	   @Override
	   public void display() {
		   System.out.println("SB Account - Acc No: " + AccountNumber + ", Name: " + name + ", Balance: " + amount);
	   }
}
