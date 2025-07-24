package Task_Programs;

public class FirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Uniq Technologires";
		String[] arr=str.split(" ");
		String res="";
		for(String word:arr) {
			System.out.println(word);
			char[] charr=word.toCharArray();
			res+=charr[0];
		}
		System.out.println(res);

	}

}
