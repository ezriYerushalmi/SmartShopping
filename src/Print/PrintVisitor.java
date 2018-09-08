package Print;

import checkout.Sales;
import database.DataBase;
import server.Server;
import user.CreditCard;
import user.GoldenUser;
import user.RegularUser;
import user.ShoppingCart;

public interface PrintVisitor {

	public  void print(GoldenUser user);
	public  void print(RegularUser user);
	public  void print(Server server);
	public  void print(CreditCard creditcard);
	public  void print(DataBase dB);
	public  void print(ShoppingCart cart);
	public void print(Sales sale);
}
