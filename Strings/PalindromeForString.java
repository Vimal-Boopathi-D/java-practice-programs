package Strings;

public class PalindromeForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="saas";
		String rev="";
		for(int i=str1.length()-1;i>=0;i--) {
			rev+=String.valueOf(str1.charAt(i));
			System.err.println(rev);
		}
		if(str1==rev)
			System.err.println("Palindrome");
		else
			System.err.println("Not a Palindrome");
	}

}
