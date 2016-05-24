package smilito.designpatterns.filter;

import java.util.List;

public class OrCriteria implements Criteria {
	
	private Criteria firstCriteria;
	private Criteria secondCriteria;

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> filteredCriteria1 = firstCriteria.meetCriteria(persons);
		List<Person> filteredCriteria2 = secondCriteria.meetCriteria(persons);
		filteredCriteria1.addAll(filteredCriteria2);
		return filteredCriteria1;
	}
	
	public OrCriteria(Criteria criteria1, Criteria criteria2){
		this.firstCriteria=criteria1;
		this.secondCriteria=criteria2;
	}

}
