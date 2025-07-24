package Task_Programs;

public class Fort{
public static String oddOrEven(int a){
	if(a%2==0){
		return"even";
	}
	else {
		return"odd";
	}
}

public static void main(String[] args){
	
	for(int i=1;i<=50;i++){
		
		System.out.println(i+" "+oddOrEven(i));
	}
}
}
