package basico;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("What is yout name?");
		String name = read.next();
		System.out.printf("%s, good to see you!", name);
		
		read.close();
	}
}
