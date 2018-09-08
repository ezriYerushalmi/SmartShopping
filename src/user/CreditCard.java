package user;
import Config.CardType;


public class CreditCard {

	private String cardOwner;
	private int cardNumber;
	private Config.CardType cardType;
	
	public CreditCard(String cardOwner , int cardNumber, CardType cardType) {
		this.cardOwner = cardOwner ; 
		this.cardNumber = cardNumber ; 
		this.cardType = cardType ; 
	}

	public String getCardOwner() {
		return cardOwner;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public Config.CardType getCardType() {
		return cardType;
	}
	
	
}
