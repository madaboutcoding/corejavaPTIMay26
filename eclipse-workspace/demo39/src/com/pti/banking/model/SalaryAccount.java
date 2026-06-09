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

}
