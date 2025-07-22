package Arrays;

import java.util.Scanner;

public class ArrayReversing {
	
	public static void reverse(int arr1[]) {
		int rsize=arr1.length;
		int[] rev=new int[rsize];
		int j=arr1.length-1;
		for (int i=0;i<rsize;i++) {
			rev[i]=arr1[j--];
			//j--;
		}
		System.out.println("Reversed Array is :");
		for(int n:rev) {
			System.out.println(n);
		}
		
	}

	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		int[] arr1=new int[size];
		
		for (int i=0;i<size;i++){
			System.out.println("Enter the value for index: "+i);
			arr1[i]=sc.nextInt();
		}
		reverse(arr1);
		
	}
}
