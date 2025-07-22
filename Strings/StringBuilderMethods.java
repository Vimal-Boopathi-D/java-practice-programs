package Strings;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		
		//append(String)
		sb.append(" World");
		System.out.println(sb); //Hello World
		
		//delete(startingIndex,endingIndex)
		sb.delete(5, 11);
		System.out.println(sb);//Hello
		
		//insert(index,String)
		sb.insert(5, " Bro");
		System.out.println(sb); //Hello Bro
		
		//replce(startingIndex,endingIndex,String)
		sb.replace(6, 11, "Java");
		System.out.println(sb); //Hello Java
		
		//reverse()
		sb.reverse();
		System.out.println(sb);//reversed string
		sb.reverse();
		
		//charAt(index)
		System.out.println(sb.charAt(1));
		
		//setChar(index,character)
		sb.setCharAt(0, 'Y');
		System.out.println(sb);



	}

}
