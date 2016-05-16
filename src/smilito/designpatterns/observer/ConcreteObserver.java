package smilito.designpatterns.observer;

public class ConcreteObserver implements Observer<Object> {
	
	private Observable<Object> observedObject;

	@Override
	public void update() {
		System.out.println("#"+hashCode() + ": " + observedObject.getObservable());
	}

	@Override
	public void setObservable(Observable<Object> t) {
		this.observedObject=t;
		observedObject.register(this);
	}	
	
}
