package checkout;

import database.DataBase;
import server.Server;
import user.CreditCard;
import user.GoldenUser;
import user.RegularUser;
import user.ShoppingCart;

public class PrintVisitor implements Visitor {

	String output;
	
	@Override
	public void visit(GoldenUser user, int barcode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(RegularUser user, int barcode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Server server) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(CreditCard creditCard) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(DataBase dataBase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ShoppingCart shoppingCart) {
		
	}

}
