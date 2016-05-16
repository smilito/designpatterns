package smilito.designpatterns.app;

import smilito.designpatterns.abstractfactory.AbstractFactoryRunclass;
import smilito.designpatterns.adapter.AdapterRunclass;
import smilito.designpatterns.builder.BuilderRunclass;
import smilito.designpatterns.factory.FactoryRunclass;
import smilito.designpatterns.observer.ObserverRunclass;
import smilito.designpatterns.prototype.PrototypeRunclass;
import smilito.designpatterns.singleton.SingletonRunclass;

public class Main {

	public static void main(String[] args) {
		
		// Observer demo
		ObserverRunclass.run();
		// Factory demo
		FactoryRunclass.run();
		// AbstractFactory demo
		AbstractFactoryRunclass.run();
		// Singleton demo
		SingletonRunclass.run();
		// Builder 
		BuilderRunclass.run();
		// Prototype
		PrototypeRunclass.run();
		// Adapter
		AdapterRunclass.run();
	}

}
