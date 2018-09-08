package checkout;
import database.DataBase;
import server.Server;
import user.CreditCard;
import user.GoldenUser;
import user.RegularUser;
import user.ShoppingCart;

public interface Visitor {

	public void visit(GoldenUser user);
	public void visit(RegularUser user);
	public void visit(Server server);
	public void visit(CreditCard creditCard);
	public void visit(DataBase dataBase);
	public void visit(ShoppingCart shoppingCart);
	
}
