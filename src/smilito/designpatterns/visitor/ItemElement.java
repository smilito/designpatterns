package smilito.designpatterns.visitor;

public interface ItemElement {
	
	public double accept(ShoppingCartVisitor visitor);

}
