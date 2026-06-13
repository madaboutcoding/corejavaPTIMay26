package com.pti.banking.m2;

import com.pti.banking.model.BankAccount;

public class CurrentAccount extends BankAccount {
//alt+s+c
	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}

	public CurrentAccount(String accName, double balance) {
		super(accName, balance);
	}
	//alt+s+v
	@Override
	public double withdraw(double amount) {		
		return super.withdraw(amount);
	}

	@Override
	public double deposit(double amount) {
		return super.deposit(amount);
	}
//accNo,accName,balance are having default access in BankAccount
	// we cant acces them in CurrentAccount 
	//Eventhough CurrentAccount is a child of BankAccount 
	//its in different package
	//Hence we use public get/set methods to access them
	@Override
	public String toString() {
		return "CurrentAccount["
				+"accNo="+this.getAccNo() 
				+", accName="+this.getAccName()
				+", balance="+this.getBalance()				
				+ "]";
	}
	
}
