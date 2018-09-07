package user;
import config.Constants;

public class CreditCard {

	private String cardOwner;
	private int cardNumber;
	private Constants.CardType cardType;
	
	public CreditCard(String cardOwner , int cardNumber, Constants.CardType cardType) {
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

	public Constants.CardType getCardType() {
		return cardType;
	}
	
	
}
