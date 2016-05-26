package smilito.designpatterns.iterator;

public class IteratorRunclass {
	
	public static void run(){
		System.out.println("BEGIN 	ITERATOR PATTERN ================");
		ConcreteCollection cc = new ConcreteCollection();
		cc.addItem(new Person("12", "Gustavo"));
		cc.addItem(new Person("2329", "Homer"));
		cc.addItem(new Person("1211","Charles"));
		MyIterator<Person> iterator = cc.getIterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("END 	ITERATOR PATTERN ================");
	}

}
