package Strings;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java Program";
		String rev="";
		char[] arr=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			rev+=arr[i];
		}
		System.out.println(rev);
	}

}
