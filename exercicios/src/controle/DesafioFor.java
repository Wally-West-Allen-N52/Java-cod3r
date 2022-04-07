package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String value = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(value+"i");
			value+="#";
		}
		
		System.out.println("\n");
		
		for(String v = "#"; !v.equals("######"); v+="#") {
			System.out.println(v+"v");
		}
	}
}
