package Strings;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Created using two ways 1.Literal 2.Non literal way
		//Literal Way
		String str1="java";
		String str2="java";
		System.out.println(str1==str2);//it checks memory but both points to same memory
		
		
		String str3="hello";
		str3.concat("world");
		System.out.println(str1);
		
		//Non literal way
		String str4=new String("abcd");
		String str5=new String("abcd");
		System.out.println(str4==str5);//== checks memory for non primitive data types
		
		
		//to check value use equals
		System.out.println(str4.equals(str5));
		//to change in same memory use StringBuilder or StringBuffer
		
		String str6="java";//scp area
		String str7=new String("java");//heap area but the reference is sored in scp
		System.out.println("Adress Comparision: "+(str6==str7));//false because even the value are same unlike literal way the memory adresss is different because non literal way stores in heap area 
		
		String si=str7.intern();//gets reference of that heap area in scp
		System.out.println(str6==si);
		
	}
}
