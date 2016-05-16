package smilito.designpatterns.abstractfactory;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shapeType){
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		} else {
			return null;
		}

	}
	
	public ShapeFactory(){
		
	}

	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

}
