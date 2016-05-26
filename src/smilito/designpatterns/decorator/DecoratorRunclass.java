package smilito.designpatterns.decorator;

public class DecoratorRunclass {

	public static void run(){
		System.out.println("BEGIN DECORATOR PATTERN ================");
		Car sportsCar = new SportsCar(new BasicCar());
		System.out.println("SPORTS CAR");
		sportsCar.assemble();
		System.out.println("LUXURY CAR");
		Car luxuryCar = new LuxuryCar(new BasicCar());
		luxuryCar.assemble();
		System.out.println("LUXURY&SPORTS CAR");
		Car luxuryAndSportCar = new LuxuryCar(new SportsCar(new BasicCar()));
		luxuryAndSportCar.assemble();
		System.out.println("END   DECORATOR PATTERN ================");
	}
}
