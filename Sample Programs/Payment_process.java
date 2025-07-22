package com.uniqcodes;

import java.util.*;
public class Payment_process{

void makePayment(long cardNo,String name){
	System.out.println("Credit card Payment processing");
	System.out.println("Card No : "+cardNo);
	System.out.println("Name :" +name);
	System.out.println("Payment Succesful");
}

void makePayment(long cardNo,String name,String exp_date){
	System.out.println("Debit card Payment processing");
	System.out.println("Card No : "+cardNo);
	System.out.println("Name :" +name);
	System.out.println("Payment Succesful");
}

void makePayment(int cash,String coupon){
	String disc="ABCD10";
	if(coupon.equals(disc)){
	System.out.println("Cash with coupon Payment processing");
	System.out.println("Cash : "+cash);
	System.out.println("Payment Succesful");
	}
	else{
		System.out.println("Invalid Coupon");
	}
}

public static void main(String[] args){
	Payment_process p=new Payment_process();
	Scanner sc=new Scanner(System.in);
	System.out.println("Select Your Payment Option  \n 1.Credit Card Payment \n 2.Depit Card payment \n3.Cash with coupon");
	int opt=sc.nextInt();
	switch(opt){
		case 1:
		System.out.println("Enter your credit card number");
		long cardNo1=sc.nextLong();
		System.out.println("Enter your name");
		String name1=sc.next();
		p.makePayment(cardNo1,name1);
		break;
		
		case 2:
		System.out.println("Enter your debit card number");
		long cardNo2=sc.nextLong();
		System.out.println("Enter your name");
		String name2=sc.next();
		System.out.println("Enter your exp-date");
		String exp_date=sc.next();
		p.makePayment(cardNo2,name2,exp_date);
		break;
		
		case 3:
		System.out.println("Enter your cash");
		int cash=sc.nextInt();
		System.out.println("Enter your coupon");
		String coupon=sc.next();
		p.makePayment(cash,coupon);
		break;
		
	}
}

}