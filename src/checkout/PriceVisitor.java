package checkout;
import database.DataBase;
import server.Server;
import user.CreditCard;
import user.GoldenUser;
import user.RegularUser;
import user.ShoppingCart;

public class PriceVisitor implements Visitor {

	int barCode;
	int discount;
	
	public PriceVisitor(int barcode) {
		this.barCode = barCode;
	}
	public int getDiscount() {
		return discount;
	}
	@Override
	public int visit(GoldenUser user, int barcode) {
		
	}

	@Override
	public int visit(RegularUser user, int barcode) {
		// TODO Auto-generated method stub
		
	}

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
		// TODO Auto-generated method stub
		
	}

	
	
}
