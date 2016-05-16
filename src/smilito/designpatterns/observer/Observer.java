package smilito.designpatterns.observer;

public interface Observer<T> {
	
	public void update();
	public void setObservable(Observable<T> t);

}
