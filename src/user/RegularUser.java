package user;
import checkout.Visitor;

public class RegularUser extends User {

	public RegularUser(int id, String userName, String email, String phoneNumber, CreditCard creditCard){
		super( id, userName, email, phoneNumber, creditCard);
	} 
	public void accept(Visitor v) {
		v.visit(this);
	}
}
