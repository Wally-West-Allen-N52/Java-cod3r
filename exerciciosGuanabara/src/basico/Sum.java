package basico;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Put the first number:");
		int num1 = read.nextInt();
		
		System.out.println("Put the second number: ");
		int num2 = read.nextInt();
		
		System.out.println(num1 + num2);
		
		read.close();
	}
}
