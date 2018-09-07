package database;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import checkout.Order;
import product.Product;
import user.User;
import java.util.Collections;

public class DataBaseHashMap implements DataBase{
	
	private HashMap<Integer,Product> products;
	private HashMap<String,User> users;
	private HashMap<String, Product> Orders;
	public static DataBaseHashMap instance ;
	
	private DataBaseHashMap() {
		this.products = new HashMap<Integer,Product>();
		this.users = new HashMap<String,User>();
		this.Orders = new HashMap<String,Product>();
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
		
		 return (Orders.put(order.getUserMailidentifier(), ) != null) ;
	}
	 
	 public void removeOrder(String email) {
		 Orders.remove(email);	
	 }
	 
	public ArrayList<String> getProductList() {
		ArrayList<String> productList = new ArrayList<String>();
		for (Product value : Orders.values()){
			productList.add(value.getName());
		}
		return productList;
	}
	
	public  Product getProduct(int productId) {
		
	}
	@Override
	public void removeUser(int userId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<Product> getProductList() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
