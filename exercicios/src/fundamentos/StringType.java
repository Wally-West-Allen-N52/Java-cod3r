package fundamentos;

public class StringType {

	public static void main(String[] args) {
		
		System.out.println("Hello Wallace	".charAt(2));
		
		String s = "Good night";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Good")); // Boolean type
		System.out.println(s.endsWith("night")); // Boolean type
		System.out.println(s.length());
		System.out.println(s.equals("Good Night")); // Boolean type
		System.out.println(s.equalsIgnoreCase("good night")); // Boolean type and ignore Cases
		
		// With inference
		
		var name = "Wallace";
		var lastName = "Oliverira";
		var age = 38;
		var salary = 5000.00;
		
		// Print with normal concatenation
		System.out.println("Name: " + name + "\nLast name: " + lastName + "\nAge: " + age + "\nSalary: " + salary);
		
		//Print using variation "PRINTF %s"
		System.out.printf("\nThe employee %s %s \n%d years \nEarn $CAD%.2f."
				,name, lastName, age, salary);
		
		String phrase = String.format("\n\nThe employee %s %s \n%d years \nEarn $CAD%.2f."
				,name, lastName, age, salary);
		System.out.println(phrase);
	}
}
