package com.uniqcodes;

public class PyramidABC{
	public static void main(String[] args){
		int rows=5;
		int l=0;
		for(int i=0;i<rows;i++){
			for(int j=rows;j>i;j--){
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++){
				System.out.print((char)(l+65)+" ");
				l++;
			}
			System.out.println();
		}
		
		
	}
}
