package Strings;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="listen";
		String b="silent";
		boolean res=true;
		char arr[]=a.toCharArray();
		for(char word :arr) {
			if(!(b.contains(String.valueOf(word)))) {
				res=false;
			}
		}
		if(res)
		System.out.println("Anagram");
		else
			System.out.println("Not an Anagram");
	
	}
}
