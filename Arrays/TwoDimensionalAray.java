package Arrays;

import java.util.*;

public class TwoDimensionalAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrNonLi=new int[3][3];
		int[][] arrLi= {{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arrNonLi.length;i++) {
			for(int j=0;j<arrNonLi.length;j++) {
			arrNonLi[i][j]=sc.nextInt();
		}
			
		}
		
		for(int i=0;i<arrNonLi.length;i++) {
			for(int j=0;j<arrNonLi.length;j++) {
			System.out.println(arrLi[i][j]);
		}
			
		}
		System.out.println(Arrays.deepToString(arrNonLi));
		

	}

}