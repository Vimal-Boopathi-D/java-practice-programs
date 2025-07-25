package exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class fileReaderException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr=new FileReader("src/exceptionhandling/file1.txt");//file1 existed so it works
			int i;
			while((i=fr.read()) !=-1) {
				System.out.print((char)i);
			}
			fr.close();
		}
		catch (IOException i) { // IOException is a parent class for FileNotFundException
			System.out.println("Error : "+i.getMessage());
		}
		System.out.println();
		
		
		//Throws Exception when we read not existed file
		try {
			FileReader fr=new FileReader("src/exceptionhandling/file2.txt");//file 2 not existed
			int i;
			while((i=fr.read()) !=-1) {
				System.out.print((char)i);
			}
			fr.close();
		}
		catch (IOException i) {
			System.out.println("Error : "+i.getMessage());
		}

	}

}
