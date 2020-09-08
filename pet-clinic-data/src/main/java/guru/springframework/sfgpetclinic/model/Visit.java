package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{
	
	private LocalDate date;
	private String description;
	
	@ManyToOne
	private Pet pet;
	
	public LocalDate getDate() { return date; }
	
	public void setDate(LocalDate date) { this.date = date;	}
	
	public String getDescription() { return description; }
	
	public void setDescription(String description) { this.description = description; }
	
	public Pet getPet() { return pet; }
	
	public void setPet(Pet pet) { this.pet = pet; }
	
}
