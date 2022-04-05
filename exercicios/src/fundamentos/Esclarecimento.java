package fundamentos;

import java.util.Scanner;

public class Esclarecimento {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your age?");
		int age = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println("What is your last name?");
		String lastName = keyboard.nextLine();
		
		System.out.printf("%d %s %s", age, name, lastName);
		keyboard.close();
	}
}
