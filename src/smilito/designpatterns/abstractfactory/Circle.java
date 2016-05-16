package smilito.designpatterns.abstractfactory;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Hello im a Circle!");
	}
	
	public Circle(){
		
	}

}
