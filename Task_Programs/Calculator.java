package Task_Programs;

import java.util.*;

public class Calculator{
	public int add(int a,int b){
		int result =a+b;
		return result;
	}
	public int sub(int a,int b){
		int result =a-b;
		return result;
	}
    public int mul(int a,int b){
		int result =a*b;
		return result;
	}
    public int div(int a,int b){
		int result =a/b;
		return result;
	}
    public int maxi(int a,int b){
		int result = a>b ? a : b;
		return result;
	}
    public int mini(int a,int b){
		int result = a<b ? a : b;
		return result;
	}	
	public static void main(String[] args){
	Calculator obj=new Calculator();
	Scanner sc =new Scanner(System.in);
	System.out.println("Please enter the two numbers to add");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(obj.add(a,b));
	
	System.out.println("Please enter the two numbers to sub");
	int c=sc.nextInt();
	int d=sc.nextInt();
	System.out.println(obj.sub(c,d));
	
	System.out.println("Please enter the two numbers to multiply");
	int e=sc.nextInt();
	int f=sc.nextInt();
	System.out.println(obj.mul(e,f));
	
	System.out.println("Please enter the two numbers to divide");
	int g=sc.nextInt();
	int h=sc.nextInt();
	System.out.println(obj.div(g,h));
	
	System.out.println("Please enter the two numbers to find the maximum valie");
	int i=sc.nextInt();
	int j=sc.nextInt();
	System.out.println(obj.maxi(i,j));
	
	System.out.println("Please enter the two numbers to find the minimum valie");
	int k=sc.nextInt();
	int l=sc.nextInt();
	System.out.println(obj.mini(i,j));
	
	}
}
