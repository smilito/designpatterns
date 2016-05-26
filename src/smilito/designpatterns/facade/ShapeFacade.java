package smilito.designpatterns.facade;

public class ShapeFacade {
	
	public enum ShapeType {
		
		CIRCLE, SQUARE, RECTANGLE, OTHER;

	}

	
	private Shape shape;
	
	public void draw(ShapeType shapeType){
		switch(shapeType){
		case CIRCLE:
			shape = new Circle();
			shape.makeShape();
			break;
		case SQUARE:
			shape = new Square();
			shape.makeShape();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			shape.makeShape();
			break;
		default:
			shape = new Polygon();
			shape.makeShape();
			break;
		}
	}

}
