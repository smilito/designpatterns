package smilito.designpatterns.prototype;

public class Circle extends Shape{
	
	public Circle(){
		setType("Circle");
	}
	
	public Circle(String type){
		setType(type);
	}

	@Override
	public void draw() {
		   System.out.println("Inside Circle::draw() method.");
		
	}
	
	

}
