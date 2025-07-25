package exceptionhandling;

public class nullPointerException {
	static nullPointerException n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("java");
		try {
			String s="java";
			System.out.println(n.hashCode());
			System.out.println("Programming");//it doesn't work because previous lines throws exception so it terminates
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end");

	}
}
