package com.pti.banking.model;

public class SavingAccount extends BankAccount {

	private final double MINIMUM_BALANCE=10000.00;

	public SavingAccount() {
		super();		
	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}

	public SavingAccount(String accName, double balance) {
		super(accName, balance);
	}

	@Override
	public double withdraw(double amount) {
		final double difference=this.balance-amount;
		if(difference>=MINIMUM_BALANCE) {
			this.balance=difference;
		}else {
			System.out.println("Insufficient balance. Maintain minimum 10000.00 in account");
		}
		return this.balance;
	}

	@Override
	public double deposite(double amount) {
		
		return super.deposite(amount);
	}

	@Override
	 public String toString() {
	  return "SavingAccount["
	    +"accNo="+this.accNo 
	    +", accName="+this.accName
	    +", balance="+this.balance
	    +", MinimumBalance="+this.MINIMUM_BALANCE
	    + "]";
	 }
	
	
	
}
