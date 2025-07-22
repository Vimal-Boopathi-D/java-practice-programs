package Arrays;

import java.util.Scanner;

public class ArrayRepeatdNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[5];   //creates index from 0 to 4 with default value 
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[j]==arr1[i]) {//10 5 20 15 8
					System.out.println(arr1[i]);				
				}
			}
		}
	}
}
