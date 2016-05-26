package smilito.designpatterns.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public double visit(Book book) {
		double cost = 0.0;
		
		if(book.getPrice() > 100){
			book.setPrice(book.getPrice() * 0.85);
		}
		
		System.out.println("Book ISBN::"+book.getIsbnNumber() + " cost ="+book.getPrice());
		return book.getPrice();
	}

	@Override
	public double visit(Fruit fruit) {
		double cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit.getName() + " cost = "+cost);
		return cost;
	}

}
