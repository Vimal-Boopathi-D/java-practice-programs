package Task_Programs;

import java.util.*;

public class Calculator1{
	    Scanner sc =new Scanner(System.in);
	
	public  void add(){
		System.out.println("Please enter the two numbers to add");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
		int result =a+b;
		System.out.println(result);
	}
	public  void sub(){
		System.out.println("Please enter the two numbers to sub");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
		int result =a-b;
		System.out.println(result);
	}
    public  void mul(){
		System.out.println("Please enter the two numbers to multiply");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
		int result =a*b;
		System.out.println(result);
	}
    public  void div(){
		System.out.println("Please enter the two numbers to divide");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
		int result =a/b;
		System.out.println(result);
	}
    public  void maxi(){
		System.out.println("Please enter the two numbers to find maximum");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
		int result = a>b ? a : b;
		System.out.println(result);
	}
    public  void  mini(){
		System.out.println("Please enter the two numbers to find a minimum");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
		int result = a<b ? a : b;
		System.out.println(result);
	}	
	public static void main(String[] args){
	Calculator1 obj=new Calculator1();
	obj.add();
	obj.sub();
	obj.mul();
	obj.div();
	obj.maxi();
	obj.mini();
	
	}
}