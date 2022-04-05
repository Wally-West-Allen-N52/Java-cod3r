package fundamentos.operadores;

public class Aritimeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var ageW = 37.9; // 'double' inferred
		double ageN = 23.2;
		
		System.out.println(ageW + ageN);
		System.out.println(ageW - ageN);
		System.out.println(ageW * ageN);
		System.out.println(ageW / ageN);
		System.out.println(ageW % ageN);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // 'cast' used
		System.out.println(a / (float) b); // 'cast' used
		System.out.println(a % b);
	}
}
