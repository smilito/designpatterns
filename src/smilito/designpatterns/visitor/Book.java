package smilito.designpatterns.visitor;

public class Book implements ItemElement {

	private double price;
	private String isbnNumber;

	public Book(double price, String isbnNumber) {
		super();
		this.price = price;
		this.isbnNumber = isbnNumber;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getIsbnNumber() {
		return isbnNumber;
	}



	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}



	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
