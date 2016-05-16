package smilito.designpatterns.abstractfactory;

public class AbstractFactoryRunclass {
	
	public static void run(){
		System.out.println("BEGIN 	ABSTRACT-FACTORY PATTERN ================");
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		
		Color red = colorFactory.getColor("RED");
		Color green = colorFactory.getColor("GREEN");
		
		circle.draw();
		red.fill();
		rectangle.draw();
		green.fill();
		
		System.out.println("END 	ABSTRACT-FACTORY PATTERN ================");
		
	}

}
