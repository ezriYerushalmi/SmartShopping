package user;
import checkout.Visitor;

public class GoldenUser  extends User{


	public GoldenUser(int id, String userName, String email, String phoneNumber, CreditCard creditCard){
		super( id, userName, email, phoneNumber, creditCard);
	} 

	@Override
	public void accept(Visitor v) {

	}
	@Override
	public int accept(Visitor v, int barcode) {
		return 	v.visit(this, barcode);
	}
}
