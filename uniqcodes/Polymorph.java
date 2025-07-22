package com.uniqcodes;

import java.util.*;
public class Polymorph{

int add(int a,int b){
	return a+b;
}

float add(float a,float b){
	return a+b;
	
}

long add(long a,long b){
	return a+b;
}
//sub
int sub(int a,int b){
	return a-b;
}

float sub(float a,float b){
	return a-b;
	
}

long sub(long a,long b){
	return a-b;
}
//multiply
int mul(int a,int b){
	return a*b;
}

float mul(float a,float b){
	return a*b;
	
}

long mul(long a,long b){
	return a*b;
}

int div(int a,int b){
	return a/b;
}

float div(float a,float b){
	return a/b;
	
}

long div(long a,long b){
	return a/b;
}


public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the two integer numbers to add,sub and multiply");
	int a=sc.nextInt();
	int b=sc.nextInt();
	Polymorph p=new Polymorph();
	System.out.println(p.add(a,b));
	System.out.println(p.sub(a,b));
	System.out.println(p.mul(a,b));
	System.out.println(p.div(a,b));
	
	System.out.println("Please enter the two float numbers to add,sub and multiply");
	float c=sc.nextFloat();
	float d=sc.nextFloat();
    System.out.println(p.add(c,d));
	System.out.println(p.sub(c,d));
	System.out.println(p.mul(c,d));
	System.out.println(p.div(c,d));
	
	System.out.println("Please enter the two long numbers to add,sub and multiply");
	long e=sc.nextLong();
	long f=sc.nextLong();
    System.out.println(p.add(e,f));
	System.out.println(p.sub(e,f));
	System.out.println(p.mul(e,f));
	System.out.println(p.div(c,d));
}

}
