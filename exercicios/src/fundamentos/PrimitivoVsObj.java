package fundamentos;

public class PrimitivoVsObj {

	public static void main(String[] args) {
		
		String s = "Texto";
		String s1 = new String("Tambem exto");
		
		s.toUpperCase();
		s1.toUpperCase();
		
		
		// Wrappers are objects version type of primitives
		int a = 123;
		System.out.println(a);
	}
}
