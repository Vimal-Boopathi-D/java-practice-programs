package FoodOrdering;

public class Zomato extends User implements FoodOrder {
	public Zomato(int phNo, String name, String email) {
		super(phNo, name, email);
	}
	public  void Login(int phNo) {
		int userp=getPhNo();
				if(userp==phNo) {
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
		System.out.println("MENU from Zomato:");
		System.out.println("1.Chicken Rice \n 2.Schezwan Noodles \n 3.Mushroom Biriyani \n 4.Gobi Rice \n 5. Bringe");
	}

}
