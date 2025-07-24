package Task_Programs;

public class SumUsingRecursion {
	
	static int sum(int n) {
		int digit=0;
		int total=0;
		if(n>0) {
		digit=n%10;		
		total= digit+sum(n/10);
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		System.out.print(sum(253));
	}
}
