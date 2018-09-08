package user;
import checkout.Visited;
import checkout.Visitor;

public abstract class User implements Visited {

	private int id;
	private String userName;
	private String email;
	private String phoneNumber;
	private CreditCard creditCard; 
	private ShoppingCart shoppingCart;
	
	protected User(int id, String userName, String email, String phoneNumber, CreditCard creditCard){
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.creditCard = creditCard;
		this.shoppingCart = null;
	}
	
	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void updatePerofile(){}
	
	public void getDetails(){}
	
	public CreditCard getCreditCardDetails(){
		return creditCard;
	}
	public String getEmail() {
		return email;
	}
	public abstract int  accept(Visitor v);
	 
}
