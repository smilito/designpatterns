package smilito.designpatterns.filter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class OlderCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> filteredPersons = new ArrayList<Person>();
		
		Calendar now = Calendar.getInstance();
		int todayYear = now.get(Calendar.YEAR);
		
		for(Person p : persons){
			
			Date pbdte = p.getBirthdate();
			Calendar cal = Calendar.getInstance();
			cal.setTime(pbdte);
			int personYear = cal.get(Calendar.YEAR);
			
			if(todayYear - personYear > 18){
				filteredPersons.add(p);
			}
		}
		
		return filteredPersons;
	}
	
	public OlderCriteria(){
		
	}

}
