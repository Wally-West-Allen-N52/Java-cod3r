package basico;

import java.util.Scanner;

public class MessageOne {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Employee's name:");
		String name = read.next();
		System.out.println("Employee's salary:");
		double salary = read.nextDouble();
		
		System.out.println(name + salary);
		
		read.close();
	}
}
