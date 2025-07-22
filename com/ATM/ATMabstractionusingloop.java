package com.ATM;

import java.util.Scanner;

class ATMabstractionusingloop{
	Scanner sc=new Scanner(System.in);
	
	public svAccount svAccountCreation(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String acHolder=sc.nextLine();
		System.out.println("Enter your initial deposit: ");
		double balance=sc.nextDouble();
		
		System.out.println("You have created savings account successfully");
		
		svAccount obj2=new svAccount(acHolder,balance);
		return obj2;
		
	}
	
	public zbAccount zbAccountCreation(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String acHolder=sc.nextLine();
	
		System.out.println("Enter your initial deposit: ");
		double balance=sc.nextDouble();
		
		System.out.println("You have created zero balance account successfully");
		
		zbAccount obj4=new zbAccount(acHolder,balance);
		return obj4;
		
	}
	void menu(){
		
		System.out.println("Please select any one options given below \n 1.Savings Account  \n 2.Zero Balance Account");
		int choice=sc.nextInt();
		switch (choice){
		case 1:
		svAccount obj3=svAccountCreation();
		transactionProcess(obj3);
		break;
	
		case 2:
		zbAccount obj5=zbAccountCreation();
		transactionProcess(obj5);
		break;
		
		default:
		System.out.println("Invalid option.");
		menu();
		}
	}
	
	
	void transactionProcess(svAccount obj3) {
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter  1 to continue  or 2 to  go back to main menu. ");
		 int option= sc.nextInt();
		
		 while(option==1) {
			
			 
			 System.out.println("Choose Your Transaction \n 1.Deposit \n 2.Withdraw \n 3.Balance Enquiry \n ");

				  
				 int choice =sc.nextInt();
				
				  switch(choice) {
				  case 1:
					  System.out.println("Enter amount to deposit :");
					  double dp_amount=sc.nextDouble();
					   obj3.deposit(dp_amount);
					   break;
					   
				  case 2:
					  System.out.println("Enter amount to withdraw  :");
					  double wd_amount=sc.nextDouble();
					  obj3.withdraw(wd_amount);
					  break;
					  
				  case 3:
				     obj3.balance();
				     break;
				     
				  default:
				     System.out.println("Invalid Transaction Options !");
				     break;
				  }
			
				  System.out.println("Enter  1 to continue or 2 to go back to main menu or 3 to exit ");
					  option= sc.nextInt();
					  
					  if(option==2) 
						  menu();
					  
					  else {
						 
						  break;
						  
					  }
		 }
		 if(option==2) 
						  menu();
			
	}
	
	void transactionProcess(zbAccount obj5) {
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter  1 to continue  or 2 to  go back to main menu. ");
		 int option= sc.nextInt();
		
		 while(option==1) {
			
			 
			 System.out.println("--------Chose Your Transaction -------");
				System.out.println("1 - deposit ");
				System.out.println("2 - with draw");
				System.out.println("3 - check balance ");
				
				  
				 int choice =sc.nextInt();
				
				  switch(choice) {
				  case 1:
					  System.out.println("Enter amount to deposit :");
					  double dp_amount=sc.nextDouble();
					   obj5.deposit(dp_amount);
					   
					   break;
				  case 2:
					  System.out.println("Enter amount to withdraw  :");
					  double wd_amount=sc.nextDouble();
					  obj5.withdraw(wd_amount);
					  break;
					  
				  case 3:
				     obj5.balance();
				     break;
				     
				     default:
				    	 System.out.println("Invalid Transaction Options !");
				    	 break;
				  }
			
				  System.out.println("Enter  1 to continue 2 to go back to main menu or 3 to exit");
					  option= sc.nextInt();
					  
					  if(option==2) 
						  menu();
					  else {
						  
						  break;
					  }
					  
		 }
		 if(option==2) 
						  menu();
			
	}
	
	
	public static void main(String args[]){

	
	
	ATMabstractionusingloop obj1=new ATMabstractionusingloop();
		Scanner sc=new Scanner(System.in);
	int opt=1;
	while(opt==1){
	obj1.menu();
	System.out.println("Enter 2 to exit");
	opt =sc.nextInt();
	
	
	if (opt!=1){
		
		break;	
	}
	}
	System.out.println("Thanks for visiting our bank ATM");
	
	}
}
