package com.uniqcodes;

public class Methods_types{
	public void a(){
		System.out.println("non return type without args");
	}
	public void b(String fname,String lname){
		String name=fname+lname;
		System.out.println("non return type with args :" +name);
	}
	public int c(){
		int e=10;
		int f=20;
		int g=e+f;
		return g;
	}
	public int d(int a,int b){
		int h=a+b;
		return h;
	}
	public static void main(String[] args){
		Methods_types obj =new Methods_types();
		obj.a();
		obj.b("uniq ","Technologies");
		int i=obj.c();
		System.out.println(i);
		int j=obj.d(30,40);
		System.out.println(j);
		
	}
}
