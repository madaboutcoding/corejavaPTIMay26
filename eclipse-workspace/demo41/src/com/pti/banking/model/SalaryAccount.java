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
		final double difference=this.getBalance()-amount;
		if(difference>=0) {
			this.setBalance(difference);
		}else {
			System.out.println("Insufficient balance");
		}
		
		return this.getBalance();
	}
//	50000-50000=>0>=0=>true->setBalance(0)
//	50000-1000=>49000>=0=>true->setBalance(0)
//	50000-51000=>-1000>=0=>False->Insufficient balance	
}
