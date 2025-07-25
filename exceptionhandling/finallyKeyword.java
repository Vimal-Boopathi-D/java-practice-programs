package exceptionhandling;

public class finallyKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single try,catc,finally
		try {
			String s="hello";
			System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("final 1 -\nfinally is used to close resources \nlike database andservers if it is crash");
		}
		
		System.out.println();
		// multiple catchcan be used for single try
		try {
			int a=10/0;
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("final 2");
		}
		
        System.out.println();
        
        System.out.println();
		//finally works even exception is not handled
        
		try {
			String s="hello";
			System.out.println(s.charAt(10));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("final 3- works even exception is not handled \nin catch block");
		}
		
		System.out.println();
		//single try and catch alsoworks
		try {
			
		}
		finally {
			
		}
		
		

	}

}
