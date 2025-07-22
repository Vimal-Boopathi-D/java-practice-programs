package com.uniqcodes;



public  class Product_Copy1 {
	String name;
	int id;
	int price;
	int rating;


  Product_Copy1(String name,int id,int price,int rating) {
		this.name=name;
		this.id=id;
		this.price=price;
		this.rating=rating;
		
	}
  Product_Copy1(Product_Copy1 p1,Product_Copy1 p2,Product_Copy1 p3) {
		name=p1.name;
		id=p1.id;
		price=p1.price;
		rating=p1.rating;
		
		name=p2.name;
		id=p2.id;
		price=p2.price;
		rating=p2.rating;
		
		name=p3.name;
		id=p3.id;
		price=p3.price;
		rating=p3.rating;
  }
		public static void main(String[] args) {
			Product_Copy1 p1=new Product_Copy1("vimal",1,100,5);
			Product_Copy1 p2=new Product_Copy1("boopathi",2,150,10);
			Product_Copy1 p3=new Product_Copy1("jackie",3,200,15);
			
			Product_Copy1 p=new Product_Copy1(p1,p2,p3);
		
	}

}
