package com.uniqcodes;

class Product1 {
String name;
int id;
int price;
 void detail(){
	System.out.println("Name :"+name +" "+"\nId :"+id+" "+"\nPrice :"+price);
		
}
}
class Electronics extends Product1{
	int warrenty;
}
class Grocery extends Product1{
	String exp_date;
	
}
public class Inheritence1{
		
	public static void main(String args[]){
		Electronics obj1 =new Electronics();
		obj1.name="sensor";
		obj1.id=1;
		obj1.price=200;
		obj1.warrenty=5;
		obj1.detail();
		System.out.println(obj1.warrenty);
		
		
		Grocery obj2 =new Grocery();
		obj2.name="abc";
		obj2.id=3;
		obj2.price=300;
		obj2.exp_date="12-10-2026";
		obj2.detail();
		System.out.println(obj2.exp_date);
	}
	
}
	


