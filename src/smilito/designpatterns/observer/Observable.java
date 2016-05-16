package smilito.designpatterns.observer;

public interface Observable<T> {
	public void register(Observer o); // attach
	public void unregister(Observer o); // detach
	public void notifyObservers();
	public T getObservable();
	public void setObservable(T t);
}
