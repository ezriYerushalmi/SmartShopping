
package product;
import Util.Constants.ProductType;

public class ProductFactory {

	
	public static Product buildProduct(ProductType type,int barcodeId, String name, String Company, String ExpirationDate,String category, double price) {
	
		if(type.equals(ProductType.Unit)) return new ProductByUnit(barcodeId, name, Company, ExpirationDate,category, price);

		else if(type.equals(ProductType.Weight)) return new ProductByWeight(barcodeId, name, Company, ExpirationDate,category, price);

		else return null;
		
	}	
}
