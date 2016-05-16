package smilito.designpatterns.abstractfactory;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Filling with GREEN color");
	}

	public Green(){
		
	}
}
