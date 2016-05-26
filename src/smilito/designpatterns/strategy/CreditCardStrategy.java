package smilito.designpatterns.strategy;

import java.util.Date;
import java.util.Random;

public class CreditCardStrategy implements PaymentStrategy {
	
	private String nameOnCard;
	private String cardNumber;
	private String cvv;
	private Date expirationDate;
	
	public CreditCardStrategy(String nameOnCard, String cardNumber, String cvv, Date expirationDate){
		this.nameOnCard=nameOnCard;
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		this.expirationDate=expirationDate;
	}
	

	@Override
	public boolean doPayment(double amount) {
		System.out.println("NAME: " + nameOnCard + ". CARD: " + cardNumber);
		Random r = new Random();
		if(r.nextInt(10) > 5){
			System.out.println("PAYMENT: SUCCESSFULL, Amount: " + amount);
			return true;
		} else {
			System.out.println("PAYMENT: DENIED, Amount: " + amount);
			return false;
		}
	}
	
	

}
