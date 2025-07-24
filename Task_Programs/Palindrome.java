package Task_Programs;
import java.util.*;
public class Palindrome {
	public static void palindromeOrNot(int a){
		 int b=a;
		 int reverse=0;
		 while(a>0){
		 int lastdigit=a%10;
		 reverse=reverse*10+lastdigit;
		 a/=10;
		 }
		 System.out.print(reverse);
		 if(b==reverse){
			 System.out.println("Palindrome");
			 
		 }
		 else{
			 System.out.println("Not a Palindrome");
		 }
		 
		}

		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			palindromeOrNot(n);
			
		}

}
