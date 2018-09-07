package database;
import java.util.Hashtable;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import checkout.Order;
import product.Product;
import user.User;

public class DataBaseHashMap implements DataBase{
	
	private Hashtable<Integer,Product> products;
	private Hashtable<String,User> users;
	private Hashtable<Integer,Product> Orders;
	private static DataBaseHashMap instance ;
	
	public DataBaseHashMap() {
		
	}
	public static synchronized DataBaseHashMap getInstance() {
		if (instance == null) {
			instance = new DataBaseHashMap () ; 
		}
		return instance ; 
	}
	
	
	public boolean addUser(User user) {
		return (users.put(user.getEmail(), user) != null) ; 
		
		
	}
	public User getUserByEmail(String email) {
		return users.get(email) ; 
	}
	public void removeUser(String email) {
		users.remove(email);
	}
	 public boolean addOrder(Order order) {
		
	}
	 public boolean removeOrder() {
		 
	 }
	public List<Product> getProductList() {
		
	}
	public  Product getProduct(int productId) {
		
	}
	

}
