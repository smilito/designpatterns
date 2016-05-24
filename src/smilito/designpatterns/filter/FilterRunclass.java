package smilito.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterRunclass {
	
	public static void run(){
		System.out.println("BEGIN 	FILTER PATTERN ================");
		List<Person> persons = new ArrayList<Person>();
		
		for(int i=0; i < 30 ; i++){
			Person p = Person.build();
			persons.add(p);
		}
		
		Criteria singleCriteria = new SingleCriteria();
		List<Person> singlePersons = singleCriteria.meetCriteria(persons);
		System.out.println("SINGLE");
		System.out.println(singlePersons);
		
		Criteria notNamedJamesCriteria = new NotNamedJamesCriteria();
		List<Person> notNamedJamesPersons = notNamedJamesCriteria.meetCriteria(persons);
		System.out.println("NOT JAMES");
		System.out.println(notNamedJamesPersons);
		
		Criteria olderCriteria = new OlderCriteria();
		List<Person> olderPersons = olderCriteria.meetCriteria(persons);
		System.out.println("OLDER THAN 18");
		System.out.println(olderPersons);
		
		Criteria orCriteria = new OrCriteria(notNamedJamesCriteria, singleCriteria);
		List<Person> notJamesOrSinglePersons = orCriteria.meetCriteria(persons);
		System.out.println("SINGLE OR NOT JAMES");
		System.out.println(notJamesOrSinglePersons);
		
		System.out.println("END 	FILTER PATTERN ================");

		return ;
	}

}
