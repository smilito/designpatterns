package smilito.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> filteredPersons = new ArrayList<Person>();
		
		for(Person p : persons){
			if(p.getStatus().equalsIgnoreCase("single")){
				filteredPersons.add(p);
			}
		}
		return filteredPersons;
	}
	
	public SingleCriteria(){
		
	}
	
	

}
