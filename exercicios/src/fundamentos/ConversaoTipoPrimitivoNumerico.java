package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		// conversion 'double' from 'int'
		double d = 1; // implicit type conversion 
		System.out.println(d);
		
		// 'F' convert literal 'double' to float
		float f = 1.0F; // implicit type conversion 
		System.out.println(f);
		
		// convert type with 'cast'
		float f2 = (float) 1.0; // explicit type conversion
		System.out.println(f2);
		
			int c = 4;
			byte b = (byte) c; // explicit type conversion
			System.out.println(b);
	}
}
