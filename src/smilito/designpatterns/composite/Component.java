package smilito.designpatterns.composite;

import java.nio.channels.UnsupportedAddressTypeException;

public abstract class Component {
	
	public void add(Component component){
		throw new UnsupportedOperationException("Cannot add component");
	}
	
	public void remove(Component component){
		throw new UnsupportedOperationException("Cannot remove component");
	}
	
	public String getName(){
		throw new UnsupportedOperationException("Cannot return name");
	}
	
	public double getPrice(){
		throw new UnsupportedOperationException("Cannot get price");
	}
	
	public void print(){
		throw new UnsupportedOperationException("Cannot print");
	}

}
