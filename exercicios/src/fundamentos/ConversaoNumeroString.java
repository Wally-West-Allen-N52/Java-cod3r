package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 1000; // wrapper class
		System.out.println(num1.toString()); // value 'num1' converted to String
		System.out.println(num1.toString().length()); // accessing the number of characters in a string
		
		int num2 = 100;
		System.out.println(Integer.toString(num2));
		
		
	}
}
