package Task_Programs;

public class Max_Min {

	public static void main(String[] args) {
		int n=12340;
		int a=n%10;//4
		int max=a;
		int min=a;
		while(n>0) {
		int digit=n%10;
//			if(max>digit) {
//				max=max;
//			}
//			else {
//				max=digit;
//			}
			if(digit>max) {
				max=digit;
			}
//			if(min<digit) {
//				min=min;
//			}
//			else {
//				min=digit;
//			}
			if(digit<min) {
				min=digit;
			}
			n/=10;
		}
		System.out.println("Max :"+max +"\nMin :"+min);

	}

}
