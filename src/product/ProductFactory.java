
package product;

public class ProductFactory {

	
	public static ProductWrapper buildProduct(Product product) {
	
		
		switch(product.getType()) {
		
		case UNITS: 
			return new ProductByUnit(product);
		case WEIGHT:
			return new ProductByWeight(product);
			
		}
		return null;
	}	
}
