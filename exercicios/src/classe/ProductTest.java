package classe;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.name = "Notebook";
		p1.price = 4.200;
		p1.discount = .25;
		
		var p2 = new Product();
		p2.name = "Pen";
		p2.price = .30;
		p2.discount = .05;
		
		double finalPrice1 = p1.price * (1 - p1.discount);
		double finalPrice2 = p2.price * (1 - p2.discount);
		double cart = (finalPrice1+finalPrice2)/2;
		System.out.printf("product average = %.2f ", cart);
	}
}
