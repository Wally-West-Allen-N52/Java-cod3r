package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3; // literal value
		int b = a; // variable value
		int c = a + b; // value expression
		
		c+=b; // c = c + b;
		c-=a; // c = c - a;
		c*=b; // c = c * b;
		c/=a; // c = c / a;
		c%=2; // c = c % 2;
		
		System.out.println(c);
	}
}
