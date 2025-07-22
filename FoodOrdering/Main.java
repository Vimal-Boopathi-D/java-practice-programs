package FoodOrdering;
import java.util.*;
public  class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Food Ordering App");
		System.out.println("1.Swiggy\n2.Zomato");
		System.out.println("Please select your option");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println();
			System.out.println("Welcome to Swiggy");
			
			
			System.out.println("Please enter your name");
			sc.nextLine();
			String name=sc.nextLine();		
			System.out.println("Please enter your phNo");
			int phNo=sc.nextInt();
			System.out.println("Please enter your email");
			sc.nextLine();
			String email=sc.nextLine();
			Swiggy s=new Swiggy(phNo,name,email);
			System.out.println();
			System.out.println("Your Details: \nName : "+name+""+"\nPhone Number : "+phNo+"\nEmail : "+email);
			System.out.println();
			System.out.println("YOURE REGISTERD\n");
			
			
			System.out.println("PLEASE LOGIN");
			System.out.println("1.Login by phone number\n2.Login by email\n\nSelect your option");
			int optionForLogins=sc.nextInt();
			System.out.println();
			if(optionForLogins==1) {
			System.out.println("Please enter your phNo");
			phNo=sc.nextInt();
			s.Login(phNo);
			}
			else if(optionForLogins==2) {
				System.out.println("Please enter your Email");
				email=sc.next();
				s.Login(email);
			}
			break;
		case 2:
			System.out.println();
			System.out.println("Welcome to Zomato");
			
			System.out.println("Please enter your name");
			sc.nextLine();
			String name1=sc.nextLine();
			
			System.out.println("Please enter your phNo");
			int phNo1=sc.nextInt();
			
			System.out.println("Please enter your email");
			sc.nextLine();
			String email1=sc.next();
			Zomato z=new Zomato(phNo1, name1, email1);
			System.out.println("Your Details:\nName : "+z.getName()+""+"\nPhone Number : "+z.getPhNo()+"\nEmail : "+z.getMail());
			System.out.println();
			System.out.println("YOURE REGISTERED\n");		
			System.out.println("PLEASE LOGIN");
			System.out.println("1.Login by phone number\n2.Login by email\n\nSelect your option");
			System.out.println();
			int optionForLoginz=sc.nextInt();
			if(optionForLoginz==1) {
			System.out.println("Please enter your phNo");
			phNo=sc.nextInt();
			z.Login(phNo);
			}
			else if(optionForLoginz==2) {
				System.out.println("Please enter your Email");
				email=sc.next();
				z.Login(email);
			}
		}
		
		
	}

}
