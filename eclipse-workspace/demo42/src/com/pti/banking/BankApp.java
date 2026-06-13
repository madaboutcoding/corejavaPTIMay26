package com.pti.banking;

import com.pti.banking.m2.CurrentAccount;
import com.pti.banking.model.BankAccount;
import com.pti.banking.model.SalaryAccount;
import com.pti.banking.model.SavingAccount;

public class BankApp {

	public static void main(String[] args) {
		//Access Modifier - default in inheritance
		//default memebers are not accessible outside the class and outside the package
//		System.out.println(account.balance);
		//default memebers can be access using public get/set methods
		//outside the class outside the package

		BankAccount account=new BankAccount("John Doe",50000);
		System.out.println(account);
		
		account=new SavingAccount("Alice", 50000);
		System.out.println(account);
		System.out.println(account.withdraw(10000));
		System.out.println(account.deposit(10000));
		
		account=new SalaryAccount("Adam", 50000);
		System.out.println(account);
		System.out.println(account.withdraw(10000));
		System.out.println(account.deposit(10000));
		
		account=new CurrentAccount("Bob", 50000);
		System.out.println(account);
		System.out.println(account.withdraw(10000));
		System.out.println(account.deposit(10000));
		
		
	}

}
