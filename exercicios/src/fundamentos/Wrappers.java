package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		// byte
		Byte b = 100;
		System.out.println(b.byteValue());
		
		Short s = 1000;
		System.out.println(s.toString());
		
//		Integer i = Integer.parseInt(read.next());
		Integer i2 = 1000; // int primitive type
//		Long l = 1000000L;
		System.out.println(i2.intValue());
//		System.out.println(i);
				
		
		Float f = 123F;
		System.out.println(f);
	
		Double d = 123.23; // double primitive type
		System.out.println(d.floatValue());
		 
		Boolean bo = Boolean.parseBoolean("true"); // boolean primitive type
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character cha = '#'; // char primitive type
		System.out.println(cha.toString());
		
		
		
		
		read.close();
	}
}
