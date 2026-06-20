package com.pti.banking.model;
//TransferMoney-> BankAccount Has a 
//PhonePay->Account
//pay(scan/account,amount)
public class TransferMoney {

	private BankAccount account;

	public TransferMoney() {
		super();
	}

	public TransferMoney(BankAccount account) {
		super();
		this.account = account;
	}
	
	public String transferMoney(BankAccount receiverAccount,double amount) {
		final double remainingBalance=this.account.withdraw(amount);
		final double updatedBalance=receiverAccount.deposite(amount);
		return this.account.accNo
				+" debited with "+amount
				+" current balance is "+remainingBalance 
				+receiverAccount.accNo
				+" credited with "+amount
				+" current balance is "+updatedBalance;
	}

	@Override
	public String toString() {
		return "TransferMoney [account=" + account + "]";
	}
	
}
