package com.uniqcodes;

public class PyramidAB{
	public static void main(String[] args){
		int rows=5;
		for(int i=0;i<rows;i++){
			for(int j=rows;j>i;j--){
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++){
				System.out.print((char)(i+65)+" ");
			}
			System.out.println();
		}
		
		
	}
}


