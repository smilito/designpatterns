package smilito.designpatterns.facade;

import smilito.designpatterns.facade.ShapeFacade.ShapeType;

public class FacadeRunclass {
	
	public static void run(){
		System.out.println("BEGIN FACADE PATTERN ================");
		ShapeFacade sf = new ShapeFacade();
		sf.draw(ShapeType.CIRCLE);
		sf.draw(ShapeType.RECTANGLE);
		sf.draw(ShapeType.SQUARE);
		sf.draw(ShapeType.OTHER);
		System.out.println("END	  FACADE PATTERN ================");
	}

}
