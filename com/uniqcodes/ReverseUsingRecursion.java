package com.uniqcodes;

public class ReverseUsingRecursion {
	int reverse=0;
	int digit=0;
	 int reverse(int n) {
		if(n>0) {
			digit=n%10;
		    reverse=reverse*10+digit;
		    reverse(n/10);
		}
		return reverse;
	}
	
public static void main(String[] args) {
	ReverseUsingRecursion obj=new ReverseUsingRecursion();
	
	System.out.print(obj.reverse(253));
}
}
