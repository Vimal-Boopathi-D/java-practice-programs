package Task_Programs;

import java.util.*;
public class PrimeNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean result=true;
		for(int i=2;i<a;i++){  //1 is neither prime nor composite 
			if(a%i==0){
				result=false;
				break;
			}
		}
		if(result){
			System.out.println("Prime Number");
			
		}
		else{
			System.out.println("Not a Prime Number");
		}
	}
}
