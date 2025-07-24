package Task_Programs;

import java.util.*;
public class Larger{
	static  int larger_number_among3(int a,int b,int c){
if(a>b && a>c){
		return a;
}
else if(b>a && b>c)
{
		return b;
}
else{
	return c;
}

}
public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println(larger_number_among3(a,b,c)+" "+" is greater");
}
}

