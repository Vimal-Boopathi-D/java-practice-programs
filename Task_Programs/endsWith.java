package Task_Programs;

public class endsWith {
	public static void main(String[] args) {
		//Using StringBuilder
		
		String arr[]= {"Randy Ortan","Naomi","Carla","Nandhini","CardiB","Patrick"};
		for(String word:arr) {
			if(word.endsWith("i")){
			StringBuilder sb=new StringBuilder(word);
			sb.setCharAt(word.length()-1, 'y');
			System.out.println(sb);
		}
			else
			System.out.println(word);
			
		}
		
		
		//Using String
		
//		String[] res=new String[arr.length];
//		int i=0;
//		for(String word:arr)
//		{
//			if(word.endsWith("i")) {
//				char[] w=word.toCharArray();
//				w[w.length-1]='y';
//				
//				res[i]=(String.valueOf(w));
//				i++;
//			}
//			else {
//				res[i]=word;
//				i++;
//			}
//			if(i>=arr.length) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(res));

	}

}
