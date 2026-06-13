package com.pti.banking.model;

public class SalaryAccount extends BankAccount {

	public SalaryAccount() {
		super();
		
	}

	public SalaryAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		
	}

	public SalaryAccount(String accName, double balance) {
		super(accName, balance);
	
	}
	
	@Override 
	public double withdraw(double amount) {
		final double difference=this.balance-amount;
		if(difference>=0) {
			this.balance=difference;
		}else {
			System.out.println("Insufficient balance");
		}
		
		return this.balance;
	}
//	50000-50000=>0>=0=>true->setBalance(0)
//	50000-1000=>49000>=0=>true->setBalance(0)
//	50000-51000=>-1000>=0=>False->Insufficient balance	
	@Override
	public String toString() {
		return "SalaryAccount["
				+"accNo="+this.accNo 
				+", accName="+this.accName
				+", balance="+this.balance				
				+ "]";
	}
}
