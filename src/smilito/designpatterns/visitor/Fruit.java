package smilito.designpatterns.visitor;

public class Fruit implements ItemElement {

	private double pricePerKg;
	private int weight;
	private String name;

	public double getPricePerKg() {
		return pricePerKg;
	}



	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public Fruit(double pricePerKg, int weight, String name) {
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}



	@Override
	public double accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
