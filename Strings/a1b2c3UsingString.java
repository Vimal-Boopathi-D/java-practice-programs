package Strings;

public class a1b2c3UsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method sub
		String str="a1b2c3";
		String res="";
		char[] charr=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length()-1;i+=2) {
			count=Integer.parseInt(String.valueOf(charr[i+1]));
			for(int j=0;j<count;j++) {
				res+=charr[i];			
			}
		}
		System.out.println(res);

	}

}
