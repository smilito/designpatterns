package smilito.designpatterns.observer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class ModelObject {
	
	private String firstname;
	private String lastname;
	private String alias;
	
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
	
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		
		result = prime * result
				+ ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result
				+ ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelObject other = (ModelObject) obj;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Field [] fields = this.getClass().getDeclaredFields();
		Method [] methods = this.getClass().getDeclaredMethods();
		for(int i=0 ; i < methods.length ; i++){
			String methodName = methods[i].getName();
			for(int j=0 ; j < fields.length ; j++){
				String fieldName = fields[j].getName();
				if(methodName.toLowerCase().contains("get"+fieldName.toLowerCase())){
					try {
						String propertyAsString = fieldName + "=" + (String) methods[i].invoke(this, null);
						if(j==fields.length-1){
							sb.append(propertyAsString);
						} else {
							sb.append(propertyAsString+", ");
						}
						
					} catch (IllegalAccessException | IllegalArgumentException
							| InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
			}
		}
		return this.getClass().getName() + "={" + sb.toString() + "}";
	}
	
	
	
	

}
