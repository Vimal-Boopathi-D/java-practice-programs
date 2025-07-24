package Strings;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb1=new StringBuilder();	
		StringBuilder sb2=new StringBuilder("java");
		
		
		//same String methods like equals,replace,hashCode etc..
		

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
		
		//setCharAt()
		sb.setCharAt(0, 'a');
		System.out.println(sb);
		
		
		//capacity()
		System.out.println(sb.capacity());
		System.out.println(sb1.capacity());
		
		//ensureCapacity()
		sb1.ensureCapacity(100);
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		
		//toString()
		String ts=sb2.toString();
		System.out.println(ts);
		
		//lastIndexOf()
        StringBuilder sb3 = new StringBuilder("hello world, hello java");
        
        int index = sb3.lastIndexOf("hello");
        
        System.out.println("Last occurrence of 'hello' is at index: " + index);
	}

}
