package Task_Programs;

import java.util.*;
public class OddEven{
	public static String Odd_Or_Even(int num){
		String result= num%2==0 ? "even" : "odd";
		return "The given number is "+ result;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Odd_Or_Even(n));
		
	}
}