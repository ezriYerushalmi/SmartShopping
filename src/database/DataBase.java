package database;
import java.util.ArrayList;

//import checkout.Order;
import product.Product;
import user.User;

public interface DataBase extends ClientDBActions, AdminDBActions {

	public boolean addUser(User user);
	public User getUserByEmail(String email); 
	public void removeUser(String email) ;
	//public boolean addOrder(Order order);
	//public boolean removeOrder(String email);
	public ArrayList<String> getProductList() ;
	public Product getProduct(int productId);
	
	
}