package smilito.designpatterns.observer;

public final class ObserverRunclass {
	
	public static final void run(){
		
		System.out.println("BEGIN 	OBSERVER PATTERN ================");
		
		ModelObject m1 = new ModelObject();
		m1.setFirstname("Pepe");
		m1.setLastname("Argento");
		m1.setAlias("Chorro");
		
		ModelObject m2 = new ModelObject();
		m2.setFirstname("Moni");
		m2.setLastname("Argento");
		m2.setAlias(m2.getFirstname());
		
		
		ConcreteObservable observable = new ConcreteObservable(m1);
		
		new ConcreteObserver().setObservable(observable);
		new ConcreteObserver().setObservable(observable);
		new ConcreteObserver().setObservable(observable);
		
		observable.setObservable(m2);
		observable.setObservable(m1);
		
		System.out.println("END 	OBSERVER PATTERN ================");
	}

}
