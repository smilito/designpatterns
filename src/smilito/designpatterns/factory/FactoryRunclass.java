package smilito.designpatterns.factory;

public class FactoryRunclass {
	
	public static void run(){
		 System.out.println("BEGIN 	FACTORY PATTERN ================");
		 
		 ShapeFactory sf = new ShapeFactory();
		 
		 Shape circle = sf.getShape("CIRCLE");
		 Shape rectangle = sf.getShape("RECTANGLE");
		 
		 circle.draw();
		 rectangle.draw();
		 
		 System.out.println("END 	FACTORY PATTERN ================");
	}
}
