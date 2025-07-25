package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_IdMisMatch {
	static int id=90258;
	static String pass="zxcvbnm,./";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter youtr id:");
			int idFromUser=sc.nextInt();
			if(id==idFromUser) {
				System.out.println("Enter youtr password");
				String passFromUser=sc.next();
				if(pass.equals(passFromUser)) {
					System.out.println("Welcome");
					break;
				}
				else {
					System.out.println("Incorrect Password");
					System.err.println("Re-Login");
				}
			}
			else {
				System.out.println("Incorrect user ID");
				System.err.println("Re-Login");
			}
		}
		catch(InputMismatchException i){
			System.err.println("Input Mismatch");
			System.err.println("Re-Login");
			
		}
		}

	}

}
