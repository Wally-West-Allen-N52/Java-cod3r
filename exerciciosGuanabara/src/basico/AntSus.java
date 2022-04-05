package basico;

import java.util.Scanner;

public class AntSus {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Ant, num and sus...");
		int num = read.nextInt();
		
		int ant = num-1;
		int sus = num+1;
		
		System.out.printf("%d %d %d", ant, num, sus);
		
		read.close();
	}
}
