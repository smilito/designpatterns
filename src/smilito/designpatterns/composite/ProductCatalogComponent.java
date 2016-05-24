package smilito.designpatterns.composite;

import java.util.ArrayList;

public class ProductCatalogComponent extends Component {
	
	private String name;
	private ArrayList<Component> items = new ArrayList<Component>();
	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		items.add(component);
	}
	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		items.remove(component);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(Component c : items){
			c.print();
		}
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		Double accumulated = new Double(0.0);
		for(Component c : items){
			accumulated+=c.getPrice();
		}
		return accumulated;
	}
}
