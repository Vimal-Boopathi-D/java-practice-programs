package exceptionhandling;

public class exceptionbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("java");
		try {
			String s="java";
			System.out.println(s.charAt(10));
			System.out.println("Programming");//it doesnt work because previous lines throws exception so it terminates
		}catch(Exception e) {
			System.out.println(e.getMessage());// e is a referenece for Exception class
			System.out.println();
		}
		
		
		//StringIndexOutOfBounds
		try {
			String s="java";
			System.out.println(s.charAt(10));
			System.out.println("Programming");//it doesnt work because previous lines throws exception so it terminates
		}catch(StringIndexOutOfBoundsException s) {
			System.out.println(s.getMessage());
			
			//err object to display in red
			System.err.println(s.getMessage());
			
			
			System.out.println(s.getLocalizedMessage());
			System.out.println(s.fillInStackTrace());
			System.out.println();
		}
		
		//ArithmeticExceptio
		try {
			int a=10;
			int b=a/0;
			System.out.println(b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
