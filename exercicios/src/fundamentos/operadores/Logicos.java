package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean cond1 = true; // literal value
		boolean cond2 = 3 > 7; // relational value
		
		System.out.println(cond1 && cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);
		System.out.println(!cond1); // logical negation
		System.out.println(!cond2); // logical negation
		
		// truth table
		System.out.println("Truth Table 'AND'");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		System.out.println("\nTruth Table 'OR'");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTruth Table 'XOR'");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
	
		System.out.println("\nTruth Table 'NOT'");
		System.out.println(!true);
		System.out.println(!false);

	}
}
