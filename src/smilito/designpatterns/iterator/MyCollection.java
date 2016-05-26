package smilito.designpatterns.iterator;

public interface MyCollection<T>{
	public void addItem(T t);
	public void removeItem(T t);
	public MyIterator<T> getIterator();
}
