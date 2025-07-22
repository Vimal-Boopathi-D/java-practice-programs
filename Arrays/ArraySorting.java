package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[5];  
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[j]<arr1[i]) {//10 5 20 15 8
					temp=arr1[i];    //5 10 20 15 8
					arr1[i]=arr1[j];
					arr1[j]=temp;					
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
   	}

}
