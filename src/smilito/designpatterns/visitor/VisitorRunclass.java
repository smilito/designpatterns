package smilito.designpatterns.visitor;

public class VisitorRunclass {
	
	public static void run(){
		
		System.out.println("BEGIN VISITOR PATTERN ================");
		ItemElement [] elements = {new Book(112.4, "281"), new Book(99.8, "22112"), new Fruit(0.8, 2, "Banana"),
				new Fruit(1.32, 2, "Apple"), new Book(220.0, "28391")};
		
		double accum = 0.0;
		for(ItemElement ie : elements){
			ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
			accum+= ie.accept(visitor);
		}
		
		System.out.println("Total: " + accum);
		System.out.println("END   VISITOR PATTERN ================");
	}

}
