package database;
import user.User;

public interface AdminDBActions {

	
	public  boolean addUser(User user);
	public  User getUserByEmail(String email);
	public  void removeUser(String email); 
}
