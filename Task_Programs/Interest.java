package Task_Programs;

import java.util.*;
public class Interest{
	public float simple_Interest(int P,float r,int t){
		float si=(P*r*t)/100;
		return si;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Interest obj=new Interest();
		int P=sc.nextInt();
		float r=sc.nextFloat();
		int t=sc.nextInt();
		
		
		System.out.println("Simple Interest is : "+ obj.simple_Interest(P,r,t));
		
	}
}