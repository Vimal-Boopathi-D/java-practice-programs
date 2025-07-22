package com.uniqcodes;

public class Copy_constructor {
	int id;
	String name;
	
	Copy_constructor(int id,String name){//first Constructor
		this.id=id;
		this.name=name;
		
	}
	Copy_constructor(Copy_constructor f){//COPY CONSTRUCTOR
		id=f.id;
		name=f.name;
	}

	public static void main(String[] args) {
		Copy_constructor f=new Copy_constructor(17,"Jackie");
		Copy_constructor c=new Copy_constructor(f);//passing object as a parameter
		f.name="chan";
		System.out.println("First data "+f.id+" "+f.name);
		System.out.println("Second data "+c.id+" "+c.name);

	}

}
