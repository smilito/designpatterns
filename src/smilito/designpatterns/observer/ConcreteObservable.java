package smilito.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable<Object> {
	
	private List<Observer> observersList = new ArrayList<Observer>();
	private Object observedObject = null;
	private final Object MUTEX = new Object();

	@Override
	public void register(Observer t) {
		if(t == null || observersList.contains(t)){
			throw new RuntimeException("The object you are trying to add is null or is alredy inside the list");
		}
		observersList.add(t);
	}

	@Override
	public void unregister(Observer t) {
		if(t == null || observersList == null || ! observersList.contains(t)){
			throw new RuntimeException("The object you are trying to remove is not inside the list");
		}
		observersList.remove(t);
	}

	@Override
	public void notifyObservers() {
		List<Observer> localObsList = null;
		
		synchronized (MUTEX) {
			localObsList = this.observersList;
			for(Observer ob : localObsList){
				ob.update();
			}
		}
	}

	@Override
	public Object getObservable() {
		// TODO Auto-generated method stub
		return observedObject;
	}

	@Override
	public void setObservable(Object t) {
		if(!t.equals(observedObject)){
			this.observedObject=t;
			notifyObservers();
		}
	}

	public ConcreteObservable(List<Observer> observersList,
			Object observedObject) {
		super();
		this.observersList = observersList;
		this.observedObject = observedObject;
	}

	public ConcreteObservable(Object observedObject) {
		this.observersList = new ArrayList<Observer>();
		this.observedObject = observedObject;
	}


}
