package Strings;

public class StringAlternateUcLc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java programming";
		String res="";
		String temp="";
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				temp=String.valueOf(str.charAt(i)).toUpperCase();
				res+=temp;			}
			else {
				temp=String.valueOf(str.charAt(i)).toLowerCase();
				res+=temp;
			}
			temp="";
		}
		System.err.println(res);
	}

}
