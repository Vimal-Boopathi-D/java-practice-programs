package Task_Programs;

import java.util.*;
public class Switcht{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char var=sc.next().charAt(0);
		int a=10;
		int b=20;
		switch(var){
			case '+':
			   System.out.println(a+b);
			   break;
		    case '-':
			
			   System.out.println(a-b);
			   break;
            case '*':
			   System.out.println(a*b);
			   break;
            case '/':
			   System.out.println(a/b);
			   break;
    		default:
				System.out.println("invalid");
		}
          
	}
}
