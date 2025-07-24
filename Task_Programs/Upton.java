package Task_Programs;

import java.util.*;
public class  Upton{
public static int Printupton(int a){
if(a>0){
	Printupton(a-1);
    System.out.println(a);

}
return a;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Printupton(n);
}
}