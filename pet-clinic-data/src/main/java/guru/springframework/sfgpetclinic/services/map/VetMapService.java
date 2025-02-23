package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 7/21/18.
 */
@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialtyService specialtyService;
	
    public VetMapService(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}

	@Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
    	if (object.getSpecialties().size() > 0) {
    		object.getSpecialties().forEach(specialty -> {
    			if (specialty.getId() == null) {
    				specialtyService.save(specialty);
    				System.out.printf("specialtyid in vet.save:%d%n",specialty.getId());
    			}
    		});
    	}
    	
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

	@Override
	public Vet findByLastName(String lastName) {
		return this.findAll()
			.stream()
			.filter(vet -> vet.getLastName().equalsIgnoreCase(lastName))
			.findFirst().orElse(null);
	}
}
