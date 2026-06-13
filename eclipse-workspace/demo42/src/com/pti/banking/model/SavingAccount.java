package com.pti.banking.model;

public class SavingAccount extends BankAccount {

	private final double MINIMUM_BALANCE=10000.00; //constant
	
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
		double difference=this.balance-amount;
		if(difference>=MINIMUM_BALANCE) {
			this.balance=difference;
		}else {
			System.out.println("Insufficient balance");
		}		
		return this.balance;
	}
	//MB=10000 balance=50000 amount=10000
	//50000-10000=40000>=10000->true->setBalance(40000)
	//50000-50000=0>=10000->False->setBalance(40000)
	//50000-49000=1000>=10000->False->setBalance(40000)
	//alt+s+s+s

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
