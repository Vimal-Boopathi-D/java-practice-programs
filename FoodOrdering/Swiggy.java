package FoodOrdering;

public class Swiggy extends User implements FoodOrder{
	public Swiggy(int phNo,String name,String email){
		super(phNo,name,email);
	}
	public  void Login(int phNo) {
		int user=getPhNo();
		   if(user==phNo) {
			System.out.println("Your Registered phone number is"+""+phNo);
			menu();
		}
		   else {
			   System.out.println("Invalid Phone num");
		   }
	}
	public void Login(String email) {
		String user=getMail();       
		if(getMail().equals(email)) {
			System.out.println("Your Registered email is"+email);
			menu();
		}
		else {
			 System.out.println("Invalid Email");
		 }

	}

	public void menu() {
		System.out.println("MENU from Swiggy:");
		System.out.println("1.Chicken Biriyani \n 2.Veg Biriyani \n 3.Meals \n 4.Idly \n 5. Dosa");
	}

}
