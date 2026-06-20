package com.pti.banking.m2;

import com.pti.banking.model.BankAccount;

public class CurrentAccount extends BankAccount {

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}

	public CurrentAccount(String accName, double balance) {
		super(accName, balance);
	}

	@Override
	public double withdraw(double amount) {
			return super.withdraw(amount);
	}

	@Override
	public double deposite(double amount) {
			return super.deposite(amount);
	}

	@Override
	public String toString() {
		return "CurrentAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}

	
}
