package smilito.designpatterns.strategy;

import java.util.Random;

public class PaypalStrategy implements PaymentStrategy {
	
	private String email;
	private String password;
	
	public PaypalStrategy(String email, String password){
		this.email=email;
		this.password=password;
	}

	@Override
	public boolean doPayment(double amount) {
		System.out.println("NAME: " + email);
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
