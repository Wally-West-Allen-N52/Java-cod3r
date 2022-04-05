package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Good");
		
		System.out.printf("Sort numbers %d %d %d %d %d %d %n", 12, 60, 27, 58, 19, 33);
		
		System.out.printf("Salary R$%.1f%n", 5500.45);
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("People employee name: ");
		String name = read.nextLine();
		System.out.println("Text the last name");
		String lastName = read.nextLine();
		System.out.println("Text the age");
		int age = read.nextInt();
		
		System.out.printf("Hello, %s %s %d!!", name, lastName, age);
		read.close();
	}
}
