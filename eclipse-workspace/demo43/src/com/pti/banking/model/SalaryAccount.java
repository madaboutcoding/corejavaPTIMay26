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
		final double difference = this.balance - amount;
		if (difference >= 0) {
			this.balance = difference;
		} else {
			System.out.println("Insufficient Balance.");
		}
		return this.balance;
	}

	@Override
	public double deposite(double amount) {

		return super.deposite(amount);
	}

	@Override

	public String toString() {
		return "SalaryAccount[" + "accNo=" + this.accNo + ", accName=" + this.accName + ", balance=" + this.balance
				+ "]";
	}
}
