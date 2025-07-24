package Task_Programs;

import java.util.*;
public class ATM{
	int pin=345678;
	int bal=50000;
	Scanner sc=new Scanner(System.in);
	
	
	
public void Withdraw(){
	System.out.println("Please Enter the pin number");
	int num1=sc.nextInt();
	if(num1==pin){
		System.out.println("Please Enter the amount");
		int amntw=sc.nextInt();
		bal-=amntw;
		System.out.println("Your balance amount is"+bal);
	}
}



public void Deposit(){
	System.out.println("Please Enter the pin number");
	int num1=sc.nextInt();
	if(num1==pin){
		System.out.println("Please Enter the amount");
		int amntd=sc.nextInt();
		bal+=amntd;
		System.out.println("Your total amount is"+bal);
	}
}



public void Balance_Enquiry(){
	System.out.println("Please Enter the pin number");
	int num1=sc.nextInt();
	if(num1==pin){
		System.out.println("Your balance amount is"+bal);
	}
}
public static void main(String[] args){
	Scanner sc1=new Scanner(System.in);
	ATM obj=new ATM();
	System.out.println("1.Withdraw");
	System.out.println("2.Deposit");
	System.out.println("3.Balance_Enquiry");
	System.out.println("Please Select the Option");
	int opt=sc1.nextInt();
	if(opt==1)
		obj.Withdraw();
	else if(opt==2)
		obj.Deposit();
	else if(opt==3)
		obj.Balance_Enquiry();
	else
		System.out.println("Invalid Option");
	}


}
