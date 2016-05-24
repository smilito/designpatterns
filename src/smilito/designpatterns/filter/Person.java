package smilito.designpatterns.filter;

import java.util.Date;
import java.util.Random;

public class Person {
	
	private String firstname;
	private String lastname;
	private String status;
	private Date birthdate;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	private static String [] firstnames = {"James", "Louis", "John", "Bender", "Selma", "Jean", "Bart", "Tony"};
	private static String [] lastnames = {"Johnson", "Martins", "Stevenson", "Polansky", "Barnes", "Alderweireld", "Carter"};
	private static String [] statuses = {"married", "single", "divorced"};

	private static String getRandomOfArray(String [] array){
		Random r = new Random();
		int random = r.nextInt();
		if(random < 0){
			random*=-1;
		}
		int arrayLength = array.length;
		int key = random%arrayLength;
		return array[key];
	}
	
	private static Date getRandomDate(){
		Random r = new Random();
		Date d = new Date(r.nextLong());
		return d;
	}

	public static Person build(){
		Person p = new Person();
		p.setFirstname(getRandomOfArray(firstnames));
		p.setLastname(getRandomOfArray(lastnames));
		p.setStatus(getRandomOfArray(statuses));
		p.setBirthdate(getRandomDate());
		
		return p;
	}
	
	public Person(){
		
	}
	@Override
	public String toString() {
		return "Person{name="+firstname+", lastname="+lastname+", status="+status+", birthdate= "+birthdate+"}";
	}
}
