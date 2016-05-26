package smilito.designpatterns.decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.println("Adding LuxuryCar functionality");
	}
	
	

}
