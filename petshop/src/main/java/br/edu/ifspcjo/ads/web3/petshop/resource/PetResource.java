
package br.edu.ifspcjo.ads.web3.petshop.resource;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifspcjo.ads.web3.petshop.PetshopApplication;
import br.edu.ifspcjo.ads.web3.petshop.domain.model.Pet;
import br.edu.ifspcjo.ads.web3.petshop.repository.PetRepository;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/pets")
public class PetResource {

    private final PetshopApplication petshopApplication;
	
	@Autowired
	private PetRepository petRepository;

    PetResource(PetshopApplication petshopApplication) {
        this.petshopApplication = petshopApplication;
    }
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_REGISTER_PET')")
	public List<Pet> list(){
		return petRepository.findAll();
	}
	
	// testar Postman
	// http://localhost:8080/users

	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_SEARCH_PET')")
	@ResponseStatus(HttpStatus.CREATED)
	public Pet create(@Valid @RequestBody Pet pet, HttpServletResponse response) {
		return petRepository.save(pet);
	}
	

	@GetMapping("/{id}")
	@PreAuthorize("hasAuthority('ROLE_SEARCH_PET')")
	public ResponseEntity<Pet> findById(@PathVariable Long id){
		Optional<Pet> pet = petRepository.findById(id);
		if(pet.isPresent()) {
			return ResponseEntity.ok(pet.get());
		}
		return ResponseEntity.notFound().build();
	}

	// testar Postman
	// GET - http://localhost:8080/users/1
	// GET - http://localhost:8080/users/10

}