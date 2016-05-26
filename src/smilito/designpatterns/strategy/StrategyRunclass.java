package smilito.designpatterns.strategy;

import java.util.Date;

public class StrategyRunclass {

	public static void run(){
		System.out.println("BEGIN STRATEGY PATTERN ================");
		ShoppingCart sc = new ShoppingCart();
		sc.add(new Item("BLUE T SHIRT", 35.69));
		sc.add(new Item("GREEN SWEATER", 51.26));
		sc.add(new Item("RED HAT SM", 14.68));
		sc.pay(new CreditCardStrategy("Gustavo", "4546789032154411", "18", new Date()));
		sc.pay(new PaypalStrategy("pepe@mgil.com", "password"));
		System.out.println("END STRATEGY PATTERN ================");
	}
}
