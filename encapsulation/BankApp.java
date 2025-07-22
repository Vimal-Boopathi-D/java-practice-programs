package encapsulation;
//POJO -plain old java object
//encapsulated class
//entity class
class Bank {
private int balance=1000;

//Getter
public int getBalance(int PIN) {
	if(PIN==1111) {
		return balance;
	}
	return 0;
}

//Setter
public void setBalance(int PIN,int balance) {
	if(PIN==1111) {
		this.balance=balance;
	}
}
}

public class BankApp{
	public static void main(String[] args) {
		Bank obj=new Bank();
		System.out.println(obj.getBalance(1111));
		obj.setBalance(1111, 2000);
		System.out.println(obj.getBalance(1111));
	}
}
