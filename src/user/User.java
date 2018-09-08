package user;
import checkout.Visited;
import checkout.Visitor;

public abstract class User implements Visited {

	protected int id;
	protected String userName;
	protected String email;
	protected String phoneNumber;
	protected CreditCard creditCard; 
	protected ShoppingCart shoppingCart;
	
	protected User() {
		
	}
	
	public void updatePerofile(){}
	
	public void getDetails(){}
	
	public CreditCard getCreditCardDetails(){
		return creditCard;
	}
	public String getEmail() {
		return email;
	}
	public abstract void accept(Visitor v);
	 
}
