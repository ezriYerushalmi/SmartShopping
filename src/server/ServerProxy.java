package server;
import java.util.Date;

import Config.CardType;
import Config.Constants;
import Config.UserType;
import logger.Logger;
import logger.LoggerConsole;

public class ServerProxy {

	private Server server;
	private Logger logger;
	private int counterUser;
	private static ServerProxy instance ; 
	
	private ServerProxy() {
		this.server = Server.getInstance() ; 
		this.logger = new LoggerConsole() ; 
		this.counterUser = 0 ; 
	}
	
	public static synchronized ServerProxy getInstance () {
		if(instance == null) {
			instance = new ServerProxy() ; 
		}
		return instance ; 
	}
	
	public boolean getLogginDetails(String email , int password) {
		if(isServerAvailable()) {
			counterUser ++ ;
			logger.log(new Date(), "User" + email + " wants to connect");
			server.getLogginDetails(email, password);
		}
		return false ; 
	}
	public void checkOut(String email) {
		server.checkOut(email);
	}
	private boolean isServerAvailable() {
		return (counterUser  <= Constants.MAX_USERS_ON_SERVER) ; 
	}
	
	public boolean postRegisterdDetails(UserType type,int id,String email ,String name,String phoneNumber, int cardNumber ,CardType cardType) {
		logger.log(new Date(), "New Registerd User : id: " + id + "Name:" + name );
		return server.postRegisterdDetails(type,id, email , name, phoneNumber, cardNumber ,cardType); 
	}
	
	public String getItemByBarcode(int barcode) {
		
	}
	
	public String getServerDetails() {
		
	}
	
	public String addProduct(String userMail, int productBarCode) {
		
		logger.log(new Date(), "User: " +userMail +" wants new item");
		return server.addProduct(userMail, productBarCode);
		
	}
	
	public boolean removeProduct(String email , int productBarCode) {
		server.removeProduct(email, productBarCode)
	}
	
	public String makePurchase(int userId) {
		
	}

	public String removeCart(int userId) {

	}
	
	public String notifySuccessfulPurchase(int userId) {
		
	}
	
	private boolean checkAuthentication(User user) {
		
	}
}
