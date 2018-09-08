package user;
import java.util.HashMap;

import checkout.Visited;
import checkout.Visitor;
import database.ClientDBActions;
import product.ProductWrapper;

public class ShoppingCart implements Visited{

	private HashMap<Integer, ProductWrapper> productsList;
	public int cardId;
	public ClientDBActions actions;
	public User user;
	
	public ShoppingCart(){}
	public void addProduct(ProductWrapper product) {
		productsList.put(product.getBarcodeId(), product);
	}
	public void deleteProduct(int barcode) {
		productsList.remove(barcode);
	}
	public void editProduct(ProductWrapper product) {
		productsList.remove(product.getBarcodeId());
		productsList.put(product.getBarcodeId(), product);
	}
	public void clearCart() {
		productsList.clear();
	}
	public void getReceipt() {
		
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
