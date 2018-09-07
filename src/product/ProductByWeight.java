package product;

public class ProductByWeight extends Product{
	
	public ProductByWeight(int barcodeId, String name, String Company, String ExpirationDate,String category, double price) {
		super(barcodeId, name, Company, ExpirationDate,category, price);
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
