package Task_Programs;

class Student1 {
	Student1(){
		this(101);
		
	}
	
	Student1(int id){  // 101 
		this(id,"akash"); // 101 , name 
	}
	Student1(int id ,String name){  // 101 , akash
		
		this(id,name,"chennai");
	}
	
	Student1(int id, String name,String loc){ // 101 , akash , chennai 
		
		System.out.println("Student Detials ");
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Location :"+loc);
	}
	
	void sum(int a) {}
}
public class ConsChainTest1{
	
	public static void main(String args[]) {
		
		Student obj= new Student();
		        obj.sum(100);
		
	}

}

