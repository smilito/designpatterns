package smilito.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Item> items;
	
	public ShoppingCart(){
		this.items = new ArrayList<Item>();
	}
	
	public void add(Item i){
		this.items.add(i);
	}
	
	public void remove(Item i){
		this.items.remove(i);
	}
	
	public double calculateTotal(){
		double sum=0.0;
		for(Item i : items){
			sum+=i.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentStrategy paymentStrategy){
		double amount = calculateTotal();
		paymentStrategy.doPayment(amount);
	}

}
