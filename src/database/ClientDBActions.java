package database;
import java.util.ArrayList;

import product.Product;

public interface ClientDBActions {


public ArrayList<String> getProductList();
public Product getProduct(int productId);
	
	
}
