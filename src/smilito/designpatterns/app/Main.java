package smilito.designpatterns.app;

import smilito.designpatterns.abstractfactory.AbstractFactoryRunclass;
import smilito.designpatterns.adapter.AdapterRunclass;
import smilito.designpatterns.bridge.BridgeRunclass;
import smilito.designpatterns.builder.BuilderRunclass;
import smilito.designpatterns.composite.CompositeRunclass;
import smilito.designpatterns.decorator.DecoratorRunclass;
import smilito.designpatterns.factory.FactoryRunclass;
import smilito.designpatterns.filter.FilterRunclass;
import smilito.designpatterns.iterator.IteratorRunclass;
import smilito.designpatterns.observer.ObserverRunclass;
import smilito.designpatterns.prototype.PrototypeRunclass;
import smilito.designpatterns.proxy.ProxyRunclass;
import smilito.designpatterns.singleton.SingletonRunclass;
import smilito.designpatterns.strategy.StrategyRunclass;
import smilito.designpatterns.visitor.VisitorRunclass;

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
		// Bridge
		BridgeRunclass.run();
		// Filter
		FilterRunclass.run();
		// Composite
		CompositeRunclass.run();
		// Iterator
		IteratorRunclass.run();
		// Decorator
		DecoratorRunclass.run();
		// Visitor
		VisitorRunclass.run();
		// Proxy 
		ProxyRunclass.run();
		// Strategy
		StrategyRunclass.run();
	}

}
