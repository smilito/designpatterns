package smilito.designpatterns.factory;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Hello im a Circle!");
	}
	
	public Circle(){
		
	}

}
