package smilito.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection implements MyCollection<Person> {
	
	private List<Person> personsList = new ArrayList<Person>();

	@Override
	public void addItem(Person t) {
		personsList.add(t);
	}

	@Override
	public void removeItem(Person t) {
		personsList.remove(t);
	}

	@Override
	public MyIterator<Person> getIterator() {
		// TODO Auto-generated method stub
		return new ConcreteCollectionIterator(personsList);
	}
	
	public ConcreteCollection(){
		
	}
	
	private class ConcreteCollectionIterator implements MyIterator<Person>{

		private List<Person> list;
		private int count=0;
		
		@Override
		public boolean hasNext() {
			if(count < list.size()){
				return true;
			} else {
				return false;
			}
		}

		@Override
		public Person next() {
			if(count < list.size()){
				Person p = list.get(count);
				count++;
				return p;
			} else {
				return null;
			}
		}
		
		public ConcreteCollectionIterator(List<Person> list){
			this.list=list;
		}
		
	}

}
