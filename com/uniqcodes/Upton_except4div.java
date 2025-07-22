package com.uniqcodes;

public class Upton_except4div {

	public static void main(String[] args) {
		for(int i=1;i<=30;i++) {
			if(i%4==0) {
				i++;
				continue;
			}
			else {
				if(i<30) {
					System.out.print(i+",");
					}
				else {
					System.out.print(i+".");
				}
			}
		}

	}

}
