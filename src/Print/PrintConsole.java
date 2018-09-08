
package Print;

import checkout.Sales;
import database.DataBase;
import server.Server;
import user.CreditCard;
import user.GoldenUser;
import user.RegularUser;
import user.ShoppingCart;



public class PrintConsole implements PrintVisitor {

	
	@Override
	public void print(GoldenUser user) {
		// TODO Auto-generated method stub
		System.out.println("GOLDEN USER:\nId: "+user.getId()+"\nName: " +user.getUserName()+"\n"
				+ "Email: "+user.getEmail()+"\nPhoneNumber: "+user.getPhoneNumber()+"\n "
				+ "Credit Card Number: "+user.getCreditCard().getCardNumber()+"\n");
	}

	@Override
	public void print(RegularUser user) {
		// TODO Auto-generated method stub
		System.out.println("REGULAR USER:\nId: "+user.getId()+"\nName: " +user.getUserName()+"\n"
				+ "Email: "+user.getEmail()+"\nPhoneNumber: "+user.getPhoneNumber()+"\n "
				+ "Credit Card Number: "+user.getCreditCard().getCardNumber()+"\n");
	}

	@Override
	public void print(Server server) {
		// TODO Auto-generated method stub
		System.out.println("SERVER:\nIs  a live:"+server.isAlive()+"\nSum of users: "
		+server.getUsers().size()+"\n");
	}

	@Override
	public void print(CreditCard creditcard) {
		// TODO Auto-generated method stub
		System.out.println("Credit Card:\nNumber: "+creditcard.getCardNumber()+"\nCard Owner: "
				+creditcard.getCardOwner()+"\nCard Type: "
				+creditcard.getCardType()+"\n");
	}

	@Override
	public void print(DataBase dB) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void print(ShoppingCart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(Sales sale) {
		// TODO Auto-generated method stub
		
	}

	
	
}
