package user;
import checkout.PriceVisitor;
import database.ClientDBActions;
import database.DataBaseHashMap;
import product.Product;
import product.ProductDecorator;

public class UserManager {

	public ShoppingCart shoppingCart;
	public User user;
	public ClientDBActions actions;
	public double totalPayment;

	public UserManager(User connectedUser) {
		this.user = connectedUser ;
		this.shoppingCart = new ShoppingCart();
		this.actions =  DataBaseHashMap.getInstance(); 
		this.totalPayment = 0;
	}
	public User getUser(){
		return this.user;
	}
	public String addItem(int barcode, int discount) {
		Product product = actions.getProduct(barcode);
		int friendDiscount = user.accept(new PriceVisitor());
		product = new ProductDecorator(product, discount+friendDiscount);
		shoppingCart.addProduct(product);
		totalPayment += product.getPrice();
		return product.toString() +totalPayment;
	}
	
	public ShoppingCart getCart(){
		return this.shoppingCart;
	}
	public double getTotalPayment(){
		return totalPayment ; 
	}
	public void checkOut(){
		//TODO to impelemnt this method
	}

}







