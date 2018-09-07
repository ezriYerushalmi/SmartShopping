package product;

public abstract class Product {

	private int barcodeId;
	private String name;
	private String Company;
	private String ExpirationDate;
	private double price;
	private String category;

	protected Product(int barcodeId,String name, String Company, String ExpirationDate,String category, double price){
		this.barcodeId = barcodeId;
		this.name = name;
		this.Company = Company;
		this.ExpirationDate = ExpirationDate;
		this.category = category;
		this.price = price;
	}
	
	public String getCategory() {
		return category;
	}

	public int getBarcodeId() {
		return barcodeId;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return Company;
	}

	public String getExpirationDate() {
		return ExpirationDate;
	}

	public abstract double getPrice();///??????
	
	
	
}
