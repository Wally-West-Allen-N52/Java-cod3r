package basico;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("First grade: ");
		double g1 = read.nextDouble();
		
		System.out.println("Second grade: ");
		double g2 = read. nextDouble();
		
		double average = (g1 + g2) / 2;
		System.out.println(average);
		
		read.close();
	}
}
