package basico;

import java.util.Scanner;

public class ConvertMoney {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("BR$ money: ");
		double brmoney = read.nextDouble();
		
		double CAD$ = 4.5;
		
		double convert = brmoney / CAD$;
		System.out.println("CAD$"+convert);
		
		read.close();
	}
}
