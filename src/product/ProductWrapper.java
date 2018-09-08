package product;

import config.ProductType;

public abstract class ProductWrapper {

	protected Product product;
	
	
	
	protected ProductWrapper(Product product) {
		
		this.product = product;
	}
	
	public ProductType getType() {
		return product.getType();
	}
	public String getCategory() {
		return product.getCategory();
	}

	public int getBarcodeId() {
		return product.getBarcodeId();
	}

	public String getName() {
		return product.getName();
	}

	public String getCompany() {
		return product.getCompany();
	}

	public String getExpirationDate() {
		return product.getExpirationDate();
	}

	public abstract double getPrice() ;
}
