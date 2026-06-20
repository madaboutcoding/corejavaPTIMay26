package com.pti.bankingapp.model;

public abstract class BankAccount {

	private int accNo;
	private String accName;
	private double balance;
	private static int accNoCounter=0;
	{
		this.accNo=++accNoCounter;
	}
	
	
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String accName, double balance) {
		super();
		this.accName = accName;
		this.balance = balance;
	}

	public BankAccount(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}

	public double deposite(double amount) {
		this.balance=this.balance+amount;
		return this.balance;
	}
	
	public abstract double withdraw(double amount);
	//Childclass must provide behavior of withdraw method 
	
	@Override
	public String toString() {
		return "BankAccount[accNo"+this.accNo
				+ ",accName"+this.accName
				+ ",balance"+this.balance
				+ "]";
	}
	//alt+s+r

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
