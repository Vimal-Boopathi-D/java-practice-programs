package Arrays;
import java.util.*;
public class ArrayBasics {
public static void main(String args[]) {
	//Literal way
	int arr1[]= {1,2,3,4,5};
	int[] arr2= {6,7,8,9,10};
	
	//Non literal way
	int arr3[]=new int[5];   //creates index from 0 to 4 with default value 
	//for non primitive type default value is null;
	int[] arr4=new int[5];
	
	arr3[0]=10;
	arr3[1]=11;
	arr3[2]=12;
	arr3[3]=13;
	arr3[4]=14;
	
	System.out.println(arr1[0]);
	
	System.out.println(arr3[0]);
	
	
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<arr4.length;i++) {
		arr4[i]=sc.nextInt();
	}
	
	for(int n:arr4) {
		System.out.println(n);
		
	}
	
	//instead of for each we can use Arrays.toString();  for 2d array use Arrays.deepToString()
	System.out.print(Arrays.toString(arr4));
	
	
}
}
