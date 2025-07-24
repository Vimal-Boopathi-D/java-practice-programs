package Task_Programs;


import java.util.*;
public class UserClass
{
     int userid;
	 String name;
	 int age;
	 String email;
	 String pass;
	 String mobileNum;
	
	public  void get_user_details(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Please enter the id");
	 userid=sc.nextInt();
	 System.out.println("Please enter the name");
	 name=sc.next();
	 sc.next();
	 System.out.println("Please enter the age");
	 age=sc.nextInt();
	 System.out.println("Please enter the email");
	 email=sc.next();
	 System.out.println("Please enter the pass");
	 pass=sc.next();
	 System.out.println("Please enter the mobile number");
	 mobileNum=sc.next();
	 display_details(userid,name,age,email,pass,mobileNum);
	}
	public static void display_details(int userid1,String name1,int age1,String email1,String pass1,String mobileNum1){
	
	System.out.println("User id :"+userid1);
	System.out.println("Name :"+name1);
	System.out.println("Age :"+age1);
	System.out.println("Mail  id :"+email1 );
	System.out.println("Password: :"+pass1 );
	System.out.println("Mobile Number :"+mobileNum1);
	System.out.println();
	
	
	}
	public static void main(String[] args){
		while(true){
		UserClass obj=new UserClass();
	    obj.get_user_details();	
		}
	}
}
