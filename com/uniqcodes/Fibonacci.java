package com.uniqcodes;

public class Fibonacci {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int nof=10;//number of times to 
		System.out.print(a+" "+b);
		while(nof!=0) {
		int next=a+b;
		System.out.print(" "+next);
		a=b;
		b=next;
		nof--;
		}
	}

}
