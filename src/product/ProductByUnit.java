package product;

public class ProductByUnit extends ProductWrapper {
	
	private int numberOfUnits = 1;
	
	public ProductByUnit(Product product) {
		super(product);
	}
	
	public void addUnits() {
		numberOfUnits++;
	}
	public int getNumberOfUnits() {
		return numberOfUnits;
	}
	
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
