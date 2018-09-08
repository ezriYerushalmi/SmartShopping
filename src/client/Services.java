package client;

import config.CardType;
import config.UserType;
import server.ServerProxy;
public class Services {

	private ServerProxy server ; 
	private static Services instance ; 
	private Services() {
		server = ServerProxy.getInstance();
	}
	public static synchronized Services getInstance () {
		if(instance == null) {
			instance = new Services();
		}
		return instance ; 
	}

	// http post requset for user registration 
	public void PostRegisterUser(UserType type,int id,String email ,String name,String phoneNumber, int cardNumber , CardType cardType){
		server.postRegisterdDetails(type,id, email , name, phoneNumber, cardNumber ,cardType) ; 
	}
	public String addProduct(int productBarCode, String userMail) {
		return server.addProduct(userMail, productBarCode);
	}
	public void removeItem(int barcode, String email) {
		server.removeProduct(email, barcode);
	}
	public boolean getLoginDetails(String email, int password){
		return server.getLogginDetails(email, password);
	}
	public void checkOut(String email) {
		server.checkOut(email);
	}
}
