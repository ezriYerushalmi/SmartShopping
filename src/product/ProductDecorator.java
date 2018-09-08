package product;

public class ProductDecorator extends ProductWrapper {

	private ProductWrapper product;
	private int discountAmount;

	public ProductDecorator(ProductWrapper product, int discountAmount) {
		this.product = product;
		this.discountAmount = discountAmount;
	}
	public void getDiscount() {

	}
	public void setDiscount() {

	}
	public double getPrice() {
		return product.getPrice() - discountAmount;
	}





}
