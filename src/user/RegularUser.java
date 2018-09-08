package user;
import checkout.Visitor;

public class RegularUser extends User {

	public RegularUser(int id, String userName, String email, String phoneNumber, CreditCard creditCard){
		
		super.id = id;
		super.userName = userName;
		super.email = email;
		super.phoneNumber = phoneNumber;
		super.creditCard = creditCard;
	} 
	public void accept(Visitor v) {
		v.visit(this);
	}
}
