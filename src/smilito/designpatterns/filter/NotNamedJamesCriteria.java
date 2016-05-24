package smilito.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public class NotNamedJamesCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> filteredPersons = new ArrayList<Person>();
		
		for(Person p : persons){
			if(!p.getFirstname().equalsIgnoreCase("James")){
				filteredPersons.add(p);
			}
		}
		return filteredPersons;
	}
	
	public NotNamedJamesCriteria(){
		
	}
	
	

}
