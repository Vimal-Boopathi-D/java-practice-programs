package com.uniqcodes;

import java.util.*;
public class Primeuptocount{
	
	public static boolean prime_or_not(int a){
		boolean result=true;
		for(int i=2;i<a;i++){
			
			if(a%i==0){
				result=false;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count =sc.nextInt();
		int j=0;
		for(int i=2;i<=a;i++){ //1 is neither prime nor composite 
			
			if(prime_or_not(i)){
				System.out.println(i);
				j++;
			}
			if(j==count){
				break; 
			}
		}
	}
}
