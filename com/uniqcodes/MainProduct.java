package com.uniqcodes;

public class MainProduct {
	public static void main(String[] args) {
		Product p=new Product("vimal",1,100,5);
		System.out.println(p.name+" "+p.id+" "+p.price+" "+p.rating);
	}

}
