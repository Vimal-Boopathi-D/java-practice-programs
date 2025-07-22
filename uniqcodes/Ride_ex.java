package com.uniqcodes;

import java.util.*;
class Ride{
String mode;
String source;
String destination;
Scanner sc=new Scanner(System.in);
public String ride(){
	System.out.println("1.Ola\n2.Uber\n3.Rapido");
	mode=sc.next();
	System.out.println("Welcome to "+mode);
	return mode;
}

	public void display(){
	System.out.println("Please enter your source");
	source=sc.next();
	System.out.println("Please enter your destination");
	destination=sc.next();
	}
}


class Ola extends Ride{

}
class Uber extends Ride{	

}
class Rapido extends Ride{
	
}

public class Ride_ex{

public static void main(String args[]){
	Ride r1=new Ride();
	String mode1=r1.ride();
	r1.display();
	Ola ob1=new Ola();
	Uber ob2=new Uber();
	Rapido ob3=new Rapido();
	
}
}
