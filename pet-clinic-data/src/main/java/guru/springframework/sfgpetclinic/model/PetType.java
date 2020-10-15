package guru.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PetType extends BaseEntity {
	
	private String name;
	
	@Override
    public String toString() {
        return name;
    }

}
