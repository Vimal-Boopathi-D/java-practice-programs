package com.uniqcodes;

import java.util.*;
public class Scanner_task{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	String salary=sc.next();
	String name=sc.nextLine();
	sc.next();
	
	System.out.println(id+" "+ salary +" "+ name);
}
}
