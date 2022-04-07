package controle;

import java.util.Scanner;

public class whileIndeteminated {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String value = "";
		
		while(!value.equalsIgnoreCase("exit")) {
			System.out.println("You said..?");
			value = read.next();
		}
		System.out.println("Thank you!!");
		
		read.close();
	}
}
