package Arrays;

import java.util.Scanner;
public class ArrayMaxMinFindingUsingMethod{
	
	
public static String max(int arr1[]){
		int size=arr1.length;		
		int max=arr1[0];
		int maxIndex=0;
		for(int i=0;i<size;i++){
			if (arr1[i]>max){
				max=arr1[i];
				maxIndex=i;
			}
		}
		return "Maximum : "+" index= "+maxIndex+" value= "+max;
}

public static String min(int arr1[]){
	   int size=arr1.length;	
	   int min=arr1[0];
	   int minIndex=0;
	   for(int i=0;i<size;i++){
		if (arr1[i]<min){
			min=arr1[i];
			minIndex=i;
		}
	  }
	   
	   return "Minimum : "+" index= "+minIndex+" value= "+min;
}


public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		int[] arr1=new int[size];
		
		for (int i=0;i<size;i++){
			System.out.println("Enter the value for index: "+i);
			arr1[i]=sc.nextInt();
		}
		System.out.println(max(arr1));
		System.out.println(min(arr1));
	}
}
