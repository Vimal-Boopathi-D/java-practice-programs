package Task_Programs;

public class Task{
	int a=20;
	public static int A(){
		Task obj=new Task();
		int result=obj.a;
		return result;
	}
	public static void main(String[] args){
		System.out.println(A());
	}
}
