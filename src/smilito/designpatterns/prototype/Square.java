package smilito.designpatterns.prototype;

public class Square extends Shape {
	
	public Square(){
		setType("Square");
	}
	
	public Square(String type){
		setType(type);
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
		
	}

}
