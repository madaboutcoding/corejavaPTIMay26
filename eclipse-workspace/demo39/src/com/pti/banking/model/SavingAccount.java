package com.pti.banking.model;

public class SavingAccount extends BankAccount {

	public SavingAccount() {
		super();
		
	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
		
	}

	public SavingAccount(String accName, double balance) {
		super(accName, balance);
		
	}
	

}
