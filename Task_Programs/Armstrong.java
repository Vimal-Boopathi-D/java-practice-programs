package Task_Programs;

import java.util.Scanner;
public class Armstrong  {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int temp1=n;
	        int temp2=n;
	        int count=0;
	        int result=0;
	        
	        while(temp1>0) {
	           count++;
	           temp1/=10;
	        }

	        int power=1;
	        while (temp2 > 0) {
	            int digit=temp2 % 10;
	            //result+=Math.pow(digit, count);
	            for(int i=0;i<count;i++) {
	            	power=power*digit;
	            }
	            result+=power;
	            power=1;
	            temp2/=10;
	            
	        }

	        if(result==n)
	            System.out.println(n + " is an armstrong number.");
	        else
	            System.out.println(n + " is not an armstrong number.");
	    }
	}


