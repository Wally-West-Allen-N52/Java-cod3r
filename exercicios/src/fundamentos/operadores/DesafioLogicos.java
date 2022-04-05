package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {

		// Tuesday work (true or false)
		// Thursday work (true or false)

		boolean work1 = true;
		boolean work2 = false;

		boolean buyTV50 = work1 && work2;
		boolean buyTV32 = work1 ^ work2;
		boolean getHealthy = work1 || work2;
		
		System.out.println("Buy TV 50° and eat ice scream'?': " + buyTV50);
		System.out.println("Buy TV 32° and eat ice scream'?': " + buyTV32);
		System.out.println("Buy TV 32° and eat ice scream'?': "+getHealthy);
		
		// Unary operator
		System.err.println("Get healthy" + !getHealthy);

	}
}
