package database;
import java.util.ArrayList;
import java.util.HashMap;
import product.Product;
import user.User;


public class DataBaseHashMap implements DataBase{
	
	private HashMap<Integer,Product> products;
	private HashMap<String,User> users;
	//private HashMap<String, Order> Orders;
	public static DataBaseHashMap instance ;
	
	private DataBaseHashMap() {
		this.products = new HashMap<Integer,Product>();
		this.users = new HashMap<String,User>();
//		this.Orders = new HashMap<String,Order>();
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
	 
	public ArrayList<String> getProductList() {
		ArrayList<String> productList = new ArrayList<String>();
		for (Product value : products.values()){
			productList.add(value.getName());
		}
		return productList;
	}
	
	public  Product getProduct(int productId) {
		return products.get(productId);
	}
	
	public void removeUser(String email) {
		User temp = users.get(email);
		users.remove(email);
		System.out.println("user "+temp.getUserName()+" Email: "+email+ " has been removed");
	}
	
	

/*	
	 public boolean addOrder(Order order) {
		
		 boolean isAdded = (Orders.put(order.getEmailIdentifier(),order ) != null);
		 if (isAdded == true){
			 System.out.println("Order has been added");
			 return true;
		 }
		 System.out.println("Order has not been added");
		 return false;
	}
	 
	 public boolean removeOrder(String email) {
		 boolean isRemoved =  (Orders.remove(email)!= null);
		 if(isRemoved){
			 System.out.println("Order of "+users.get(email).getUserName()+" has been removed");			 
			 return isRemoved;
		 }
		 System.out.println("No order removed");
		 return isRemoved;
	 }
	*/
	
	

}
