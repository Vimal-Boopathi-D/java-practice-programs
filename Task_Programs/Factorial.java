package Task_Programs;

public class Factorial {
	int res=1;
	public  int factorial(int n) {
		if(n!=0) {
		res=n*factorial(n-1);
		}
		return res;
	}

	public static void main(String[] args) {
		Factorial obj=new Factorial();
		int fact=obj.factorial(5);
		System.out.print(fact);

	}

}
