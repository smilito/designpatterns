package smilito.designpatterns.singleton;

public class SingletonRunclass {
	
	public static void run(){
		System.out.println("BEGIN 	SINGLETON PATTERN ================");
		SingleObject o = SingleObject.getInstance();
		SingleObject oo =  SingleObject.getInstance();
		
		if(o.isThisTheSameObject(oo)){
			System.out.println("Both are same reference to the same object");
		} else {
			System.out.println("Both are not the same reference to the object");
		}
		System.out.println("END 	SINGLETON PATTERN ================");
	}

}
