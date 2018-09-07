package checkout;

import java.util.Hashtable;
import java.util.List;

public class Sales {
	
	private Hashtable<Integer, Integer> discount;
	private List<Integer> usersId;
	private static Sales instance ; 
	
	private Sales() {
		
	}
	
	public static synchronized Sales getInstance() {
		if(instance == null) {
			instance = new Sales() ; 
		}
		return instance ; 
	}
	
	public String getSales(){}
	public void notifyAll(){}
	public int checkIfDiscount(int barcode){}
	public void addDiscount (int iteamId, int discount){}
	public void registerUser(int userId){}

}
