package user;
import java.util.ArrayList;

import BarcodeReader.BarcodeReader;
import database.ClientDBActions;
import product.Product;

public class ShoppingCart {

	private ArrayList<Product> productsList;
	private BarcodeReader barcodeReader;
	public int cardId;
	public ClientDBActions actions;
	public User user;
	
	public ShoppingCart(){}
	public void addProduct(Product product) {
		productsList.add(product);
	}
	public void deleteProduct(){}
	public void editProduct(){}
	public void cleanCart(){}
}
