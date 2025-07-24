package Strings;

public class reverseBasedOnSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="how are you";
		String rev="";
		String[] starr=str.split(" ");
		for(String word:starr) {
			StringBuilder sb=new StringBuilder(word);
			sb.reverse();
			rev+=String.valueOf(sb)+" ";
		}
		System.out.println(rev);

	}

}
