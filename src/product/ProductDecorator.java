package product;

public class ProductDecorator extends Product {

	private Product product;
	private int discountAmount;

	public ProductDecorator(Product product, int discountAmount) {
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
