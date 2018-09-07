
public interface PrintVisitor {

	public  void print(GoldenUser user);
	public  void print(RegularUser user);
	public  void print(Server server);
	public  void print(CreditCard creditcard);
	public  void print(DataBase dB);
	public  void print(ShoppingCart cart);

}
