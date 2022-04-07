package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String value = "";
		do {
			System.out.println("You said!!");
			value = read.next();
			
		} while(!value.equalsIgnoreCase("exit"));
		System.out.println("Thnk you so much");
		
		read.close();
	}
}
