package database;
import java.util.ArrayList;

import product.Product;

public interface ClientDBActions {


public ArrayList<Product> getProductList();
public Product getProduct(int productcode);
	
	
}
