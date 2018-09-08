package server;
import java.util.Hashtable;

import Config.CardType;
import Config.Constants;
import Config.UserType;
import checkout.Sales;
import database.AdminDBActions;
import database.DataBaseHashMap;
import user.CreditCard;
import user.User;
import user.UserFactory;
import user.UserManager;

public class Server {
	//	Attributes

	private boolean isAlive;
	private Hashtable<String, UserManager> users;
	private Sales sales;
	private AdminDBActions actions ; 
	private static Server instance ; 


	//	Methods
	
	public boolean isAlive() {
		return isAlive;
	}
	
	private Server () {
		isAlive = true ; 
		users = new Hashtable<String, UserManager> () ;
		sales  = Sales.getInstance() ; 
		actions = DataBaseHashMap.getInstance(); 
	}
	public Hashtable<String, UserManager> getUsers() {
		return users;
	}
	public static synchronized Server getInstance() {
		if (instance == null) {
			instance = new Server () ; 
		}
		return instance ; 
	}
	public boolean getLogginDetails(String email, int password){
		User connectedUser = actions.getUserByEmail(email);
		if (connectedUser == null) {
			return false ;
		}
		UserManager newUserM = new UserManager(connectedUser);
		users.put(connectedUser.getEmail(), newUserM);
		return true ; 
	}
	public boolean postRegisterdDetails(UserType type,int id,String email ,String name,String phoneNumber, int cardNumber , CardType cardType){
		User user = createNewUser(type,id, email , name, phoneNumber, cardNumber ,cardType);
		actions.addUser(user);
		return true ; 
	}

	public String getServerDetails() {}
	
	public String addProduct(String userMail, int productBarcode) {
		
		UserManager userManager = users.get(userMail);
		int discount = sales.checkIfDiscount(productBarcode);
		return userManager.addItem(productBarcode, discount);
		
	}
	
	
	public boolean removeProduct(int userId, int productarCode)	{}
	public String  makePurchase(int userId){}
	public String  removeCart(int userId){}
	public String notifySuccessfulPurchase(int userId){}
	public User createNewUser(UserType type,int id,String email ,String name,String phoneNumber, int cardNumber , CardType cardType){
		CreditCard userCard = new CreditCard(name , cardNumber , cardType) ;
		return UserFactory.getUser(type,id,name, email , phoneNumber, userCard);
	}

	private void createNewShoppingCart(){}
	private boolean checkAuthentication(User user){}
	private void registerForSales(int userId){}
	private void notifySuccessfulPurchase(int userId){}


}
