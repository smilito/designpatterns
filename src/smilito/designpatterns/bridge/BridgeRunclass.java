package smilito.designpatterns.bridge;

public class BridgeRunclass {
	
	public static void run(){
		Shape redCircle = new Circle(10, 10, 10, new RedCircle());
		Shape greenCircle = new Circle(20, 20, 20, new GreenCircle());
		System.out.println("BEGIN 	BRIDGE PATTERN ================");
		redCircle.draw();
		greenCircle.draw();
		System.out.println("END 	BRIDGE PATTERN ================");
	}

}
