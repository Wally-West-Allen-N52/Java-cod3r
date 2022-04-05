package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Put the 3rd salary of employee: ");
		String value3 = read.nextLine().replace(',', '.');
				
		System.out.println("Put the 2rd salary of employee: ");
		String value2 = read.nextLine().replace(',', '.');
		
		System.out.println("Put the 1rd salary of employee: ");
		String value1 = read.nextLine().replace(',', '.');
		
		Double salary3 = Double.parseDouble(value3);
		Double salary2 = Double.parseDouble(value2);
		Double salary1 = Double.parseDouble(value1);
		
		double average = (salary3 + salary2 + salary1) / 3;
		System.out.println(average);
		
		read.close();
	}
}
