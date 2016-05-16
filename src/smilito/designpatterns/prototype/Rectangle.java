package smilito.designpatterns.prototype;

public class Rectangle extends Shape {
	
	public Rectangle(String type){
		setType(type);
	}
	
	public Rectangle(){
		setType("Rectangle");
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
