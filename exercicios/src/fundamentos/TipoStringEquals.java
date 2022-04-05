package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		// Wrong
		String s1 = new String("2");
		System.out.println("2" == "s");
		
		// Right
		System.out.println("2".equals(s1));
		
		Scanner read = new Scanner(System.in);
		
		String s2 = read.next();
		System.out.println("2" == s2);
		
		read.close();
	}
}
