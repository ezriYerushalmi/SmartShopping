package client;
import java.util.Scanner;

import javax.swing.plaf.InputMapUIResource;

import BarcodeReader.BarcodeReader;
import BarcodeReader.Reader;
<<<<<<< HEAD
import config.CardType;
import config.UserType;
=======
import Config.CardType;
import Config.UserType;
import server.ServerProxy;
>>>>>>> e843a52be660e6bf5e0438e208da5be4cd351d3e

public class Viewer {

	private ShoppingCartViewer shoppingCart;
	private BarcodeReader barcodeReader; 
	
	private String email;
	private int password;
	private Services services;
	
	public Viewer(ShoppingCartViewer shoppingCart) { 
		this.shoppingCart = shoppingCart;
		services = Services.getInstance();
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

	
	
	public void addItem() {
		
		int barCode = barcodeReader.readBarcode();
		String productStr = services.addProduct(barCode, email);
		
		
	}
	public void removeItem(int barcode) {
		services.removeItem(barcode, email);
	}
	public void checkOut() {
		System.out.println("Are you sure you want to checkout ?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("Yes")) {
			
		} else if (input.equalsIgnoreCase("no")) {
			
		}
		
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
