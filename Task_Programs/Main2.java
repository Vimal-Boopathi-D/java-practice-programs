package Task_Programs;

class Student3{
int id;
String name;
int age;
int mark;
public int assign_id(){
	Student3 obj1=new Student3();
	obj1.id=57;
	return obj1.id;
}
public String assign_name(){
	Student3 obj2=new Student3();
	obj2.name="vimal";
	return obj2.name;
}
public int assign_age(){
	Student3 obj3=new Student3();
	obj3.age=22;
	return obj3.age;
}
public int assign_mark(){
	Student3 obj4=new Student3();
	obj4.mark=85;
	return obj4.mark;
}
}
class Main2 {
	static int i;
	static String n;
	static int ag;
	static int mark;
	public static void Students_detail_status(){
		Student3 objs=new Student3();
		Main2.i=objs.assign_id();
		Main2.n=objs.assign_name();
		Main2.ag=objs.assign_age();
		Main2.mark=objs.assign_mark();
	}
	public static void main(String[] args){
		Students_detail_status();
		System.out.println(Main2.i);
		System.out.println(Main2.n);
		System.out.println(Main2.ag);
		System.out.println(Main2.mark);
		
	
	}
}
