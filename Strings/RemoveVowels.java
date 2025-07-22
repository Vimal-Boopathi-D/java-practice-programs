package Strings;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vowels="aeiou";
		String str="heyy hii all here";
		char[] arr=vowels.toCharArray();
		for(char word:arr) {
			if(str.contains(String.valueOf(word))) {
				str=str.replace(String.valueOf(word),"");
			}
		}
		System.out.println(str);
	}

}