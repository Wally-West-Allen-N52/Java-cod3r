package fundamentos;

public class dotNotation {

	public static void main(String[] args) {
		
		
		String s = "Good morning X";
		
		// Access point method
		s = s.replace("X", "Mr");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		// Point method in the same line
		System.out.println("Good Night Wallace".toUpperCase().concat("!!!"));
		
		
		// Point method in a variable
		String name = "Wallace";
		System.out.println("Hello ".toUpperCase() + name.toUpperCase().concat("!!"));
		
		String y = "Good morning"
				.replace("x", "Goodlooking")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Primitive types have no dot operator
		int a = 3; // a.(appears empty)
		System.out.println(a);
	}
}
