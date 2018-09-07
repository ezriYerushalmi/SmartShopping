package client;
import java.util.HashMap;

import BarcodeReader.BarcodeReader;
import BarcodeReader.Reader;
import config.CardType;
import config.UserType;
import server.ServerProxy;

public class Viewer {

	private ShoppingCartViewer shoppingCart;
	private BarcodeReader barcodeReader; 
	private ServerProxy server;
	private String email;
	private int password;
	
	public Viewer(ShoppingCartViewer shoppingCart) { 
		ServerProxy server = ServerProxy.getInstance(); 
		this.shoppingCart = shoppingCart;
	}

	public void register(UserType type,int id,String email ,String name,String phoneNumber, int cardNumber , CardType cardType  ) {
		PostRegisterUser(type,id, email , name, phoneNumber, cardNumber ,cardType) ; 
	}

	public void login(String email, int password){
		if (getLoginDetails(email, password)) {
			this.email = email;
			this.password = password;
		}
	}

	public void aboutApp(){

	}

	private void PostRegisterUser(UserType type,int id,String email ,String name,String phoneNumber, int cardNumber , CardType cardType){
		server.postRegisterdDetails(type,id, email , name, phoneNumber, cardNumber ,cardType) ; 
	}

	private boolean getLoginDetails(String email, int password){
		return server.getLogginDetails(email, password);
	}
	
	public void addItem() {
		
		int barCode = barcodeReader.readBarcode();
		String productStr = server.addProduct(email, barCode);
		
		
	}
	public void setReader(Reader reader) {
		barcodeReader.setReader(reader);
	}
	public void showItems() {

	}

	public void refreshList() {

	}
//
//	private String getItemDetails(int itemID) {
//
//	}
//
//	private String getRemoveItem(int itemID) {
//
//	}
}
