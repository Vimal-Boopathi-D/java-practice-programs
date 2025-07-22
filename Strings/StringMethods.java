package Strings;

public class StringMethods {
public static  void main(String[] args) {
	
	//length()
	System.out.println("hello".length());  // 5	
	
	//concat()
	String str1="hello";
	str1=str1.concat(" world");
	System.out.println(str1);
	
	//charAt()
	System.out.println(str1.charAt(1));
	
	//contains()
	System.out.println(str1.contains("o"));
	
	//endsWith()
	System.out.println(str1.endsWith("d"));
	
	//startWith()
	System.out.println(str1.startsWith("h"));
	
	//equals()
	String str2="java";
	String str3="java";
	System.out.println(str2.equals(str3));//also true for == because scp
	
	//equasIgnoreCase()
	String str4="java";
	String str5="JaVa";
	System.out.println(str4.equalsIgnoreCase(str5));
	
	//indexOf()
	System.out.println(str4.indexOf('a'));
	
	//indexOf('char',index to start with)
	System.out.println(str4.indexOf('a',2));
	
	//isBlank()
	String str6="";
	String str7=" ";
	System.out.println(str6.isBlank());
	System.out.println(str7.isBlank());
	
	//isEmpty()
	System.out.println(str6.isEmpty());
	System.out.println(str7.isEmpty());
	
	//repeat()
	String str8=str2.repeat(10);
	System.out.println(str8);
	
	//replace()
	String str9="aabcde";
	str9=str9.replace('a', 'e');
	System.out.println(str9);
	
	//replaceAll() for multiple characters
	str9=str9.replaceAll("b","fff");
	System.err.println(str9);
	
	//toLowerCase()
	String str10="VImaL";
	str10=str10.toLowerCase();
	System.err.println(str10);
	
	//toUpperCase()
	str10=str10.toUpperCase();
	System.err.println(str10);
	
	//trim()
	String s1 = "  hello  ";
	System.out.println(s1.trim());
	
	//strip(), stripLeading(), stripTrailing()
	String s2 = "\u2002hello\u2002";
	System.out.println(s2.strip()); // "hello"
	
	//compareTo(), compareToIgnoreCase()
	System.out.println("apple".compareTo("dpple"));  // Negative//-3 by Assci value //32 if "apple".compareTo("Apple")
	System.out.println("apple".compareToIgnoreCase("Apple"));  // 0
	
	//substring(start) / substring(start, end)
	String s3 = "hello";
	System.out.println(s3.substring(1)); // "ello"
	System.out.println(s3.substring(1, 4));  // "ell"
	
	//split(regex)
	String s4 = "a,b,c";
	String[] parts = s4.split(",");// 
	System.out.println(parts[1]);  // "b"
	
	//join(delimiter, elements...)
	String result = String.join("-", "a", "b", "c");
	System.out.println(result);  // "a-b-c"
	
	//Type Conversion
	int x = 10;
	System.out.println(String.valueOf(x));  // "10"
	
	//matches(regex)
	System.out.println("abc123".matches("[a-z]+\\d+"));  // true
	
	//replaceFirst(regex, replacement)
	String s5 = "one two two";
	System.out.println(s5.replaceFirst("two", "three"));  // "one three two"
	
	//toCharArray()
	char[] chars = "hello".toCharArray();
	System.out.println(chars[1]);  // 'e'
	
	//getBytes()
	byte[] bytes = "aello".getBytes();
	System.out.println(bytes[0]);
	
	//codePointAt(index) and codePointCount(begin, end)
	System.out.println("😊".codePointAt(0));  // 128522
	
	//intern()
	String a = new String("hello").intern(); 
	System.out.println(a);// goes to SCP
}
}
