package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity{

	private String firstname;
	private String lastname;
	
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
}
