package client;

public class ProductViewer {

	private int barCode;
	private String name;
	private int price;
	private int quantity;
	
	public ProductViewer(int barCode, String name, int price, int quantity) {
		this.barCode = barCode;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public ProductViewer(int barCode) {
		this.barCode = barCode;
	}
	
	
}
