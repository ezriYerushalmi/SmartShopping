package user;
import checkout.PriceVisitor;
import checkout.PrintVisitor;
import database.ClientDBActions;
import database.DataBaseHashMap;
import product.ProductDecorator;
import product.ProductFactory;
import product.ProductWrapper;

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
		ProductWrapper product = ProductFactory.buildProduct(actions.getProduct(barcode));
		PriceVisitor pVisitor = new PriceVisitor(barcode);
		user.accept(pVisitor);
		int friendDiscount = pVisitor.getDiscount();
		product = new ProductDecorator(product, discount+friendDiscount);
		shoppingCart.addProduct(product);
		totalPayment += product.getPrice();
		return product.toString() +totalPayment;
	}
	public void removeItem(int barcode) {
		shoppingCart.deleteProduct(barcode);
	}
	public ShoppingCart getCart(){
		return this.shoppingCart;
	}
	public double getTotalPayment(){
		return totalPayment ; 
	}
	public String receipt() {
		
		String str = "";  
		PrintVisitor visitor = new PrintVisitor();
		user.accept(visitor);
		str += visitor.getPrint();
		
		shoppingCart.accept(visitor);
		
		str += "/n" +visitor.getPrint();
		
		return str;
	}
	public String checkOut() {
		String receipt = receipt();
		
		return receipt;
	}

	public void makePurchase() {
		System.out.println("Making purchase..");
		totalPayment = 0;
		shoppingCart.clearCart();
	}
}







