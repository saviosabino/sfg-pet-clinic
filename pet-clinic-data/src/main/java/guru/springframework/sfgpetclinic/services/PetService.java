package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findByLastName(String lastName);
	
	Pet findById(Long id);
	
	Set<Pet> findAll();
	
}
