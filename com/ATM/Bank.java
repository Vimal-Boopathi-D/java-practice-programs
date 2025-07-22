package com.ATM;

	abstract class Bank{
		String acHolder;
		double balance;
		
		Bank(String acHolder,double balance){
			this.acHolder=acHolder;
			this.balance=balance;
			System.out.println("Account Holder Name: "+acHolder);
			
		}
		abstract void deposit(double amount);
		abstract void withdraw(double amount);
		void balance(){
			System.out.println("Your account balance is Rs."+balance);
		}
	}

