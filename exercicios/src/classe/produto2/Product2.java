package classe.produto2;

public class Product2 {

	String name;
	double price;
	double discount;
	
	double discountPrice() {
		return price * (1- discount);
	}
	
	double discountPrice(double managerDiscount) {
		return price * (1- discount + managerDiscount);
	}
}
