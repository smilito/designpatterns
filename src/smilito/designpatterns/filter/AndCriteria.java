package smilito.designpatterns.filter;

import java.util.List;

public class AndCriteria implements Criteria {
	
	private Criteria criteria1, criteria2;

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return criteria2.meetCriteria(criteria1.meetCriteria(persons));
	}
	
	public AndCriteria(Criteria criteria1, Criteria criteria2){
		this.criteria1=criteria1;
		this.criteria2=criteria2;
	}

}
