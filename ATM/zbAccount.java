package com.ATM;

class zbAccount extends Bank{
	zbAccount(String acHolder,double balance){
		super(acHolder,balance);
	}
	void deposit(double amount){
		balance+=amount;
		System.out.println("You have deposited Rs."+amount+" in your zero balance Account");
	}
	void withdraw(double amount){
		if (balance>amount){
			balance-=amount;
			System.out.println("You have withdrawn Rs."+amount+" from your zero balance account");
		}
		else 
			System.out.println("Insufficient balance!");
	}
}