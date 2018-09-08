package product;

public class ProductByWeight extends ProductWrapper {
	

	double weight;
	
	public ProductByWeight(Product product) {
		super(product);
	}
	
	public void addWeight(int weight) {
		this.weight += weight;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
