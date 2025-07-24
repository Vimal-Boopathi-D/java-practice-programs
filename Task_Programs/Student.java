package Task_Programs;

public class Student {
	Student(){
		this(101);
		
	}
	
	Student(int id){  // 101 
		this(id,"akash"); // 101 , name 
	}
	Student(int id ,String name){  // 101 , akash
		
		this(id,name,"chennai");
	}
	
	Student(int id, String name,String loc){ // 101 , akash , chennai 
		
		System.out.println("Student Detials ");
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Location :"+loc);
	}
	
	void sum(int a) {}
}
