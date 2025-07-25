package Strings;

import java.util.Arrays;

public class StringCount {
public static void main(String args[]) {
	String s="javascript";
	int totalCount=0;
	char[] charr=s.toCharArray();
	int[] count=new int[s.length()];
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<s.length();j++) {
			if(charr[i]==charr[j]) {
				totalCount++;
			}
		}
		count[i]=totalCount;
		totalCount=0;
	}
	System.out.println("count of"+charr[1]+" is "+count[1]);
	System.out.println(Arrays.toString(charr));
	System.out.println(Arrays.toString(count));
	
	
}
}
