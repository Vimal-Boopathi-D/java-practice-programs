package Task_Programs;

import java.util.*;
public class Vote{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		if(age>=18){
			System.out.println(name+" "+"Youre Eligible for voting");
		}
		else{
			System.out.println(name+" "+"Youre Not eligible for voting");
		}
	}
}
