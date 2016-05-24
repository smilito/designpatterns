package smilito.designpatterns.composite;

public class ProductComponent extends Component {
	
	private String name;
	private Double price;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Product{name="+name+", price="+price+"}");
	}
	

}
