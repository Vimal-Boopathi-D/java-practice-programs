package Task_Programs;
import java.util.*;
public class ReverseNum {
	
	public static void  reversing(float n1) {
		String str=String.valueOf(n1);
		String r="";
		for(int i=str.length()-1;i>=0;i--) {
			r+=str.charAt(i);
		}
		System.out.println(r);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float n=sc.nextFloat();
		reversing(n);
		
	}

}
