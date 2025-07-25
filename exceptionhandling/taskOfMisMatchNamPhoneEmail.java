package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
public class taskOfMisMatchNamPhoneEmail {

		static int phNo=902587332;
		static String name="vimal";
		static String email="abc@email.com";
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			while(true) {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter youtr Number:");
				int phNoFromUser=sc.nextInt();
				if(phNo==phNoFromUser) {
					System.out.println("Enter youtr Name");
					String NameFromUser=sc.next();
					if(name.equals(NameFromUser)) {
						System.out.println("Enter your Email");
						String emailFromUser=sc.next();
						if(email.equals(emailFromUser)) {
							System.out.println("Welcome ");
							break;
						}
						else {
							System.err.println("Incorrect email");
							System.err.println("Re-Login");
						}
						
					}
					else {
						System.err.println("Incorrect Name");
						System.err.println("Re-Login");
					}
				}
				else {
					System.err.println("Incorrect phNo");
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

