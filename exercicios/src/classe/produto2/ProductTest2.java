package classe.produto2;

public class ProductTest2 {

	public static void main(String[] args) {
		
		Product2 p1 = new Product2();
		p1.name = "Notebook";
		p1.price = 4.200;
		p1.discount = .25;
		
		var p2 = new Product2();
		p2.name = "Pen";
		p2.price = .30;
		p2.discount = .05;
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		double finalPrice1 = p1.discountPrice();
		double finalPrice2 = p2.discountPrice(.1);
		double cart = (finalPrice1+finalPrice2)/2;
		System.out.printf("product average = %.2f ", cart);
	}
}
