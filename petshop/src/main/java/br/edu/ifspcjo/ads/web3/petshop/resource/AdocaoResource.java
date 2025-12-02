package br.edu.ifspcjo.ads.web3.petshop.resource;






import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifspcjo.ads.web3.petshop.PetshopApplication;
import br.edu.ifspcjo.ads.web3.petshop.domain.model.Adocao;
import br.edu.ifspcjo.ads.web3.petshop.domain.model.Pet;
import br.edu.ifspcjo.ads.web3.petshop.repository.AdocaoRepository;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/adocao")
public class AdocaoResource {

    private final PetshopApplication petshopApplication;
	
	@Autowired
	private AdocaoRepository adocaoRepository;

    AdocaoResource(PetshopApplication petshopApplication) {
        this.petshopApplication = petshopApplication;
    }
	
	@GetMapping
	public List<Adocao> list(){
		return adocaoRepository.findAll();
	}
	
	// testar Postman
	// http://localhost:8080/users

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Adocao create(@Valid @RequestBody Adocao adocao, HttpServletResponse response) {
		return adocaoRepository.save(adocao);
	}
	// testar Postman
	// POST - http://localhost:8080/users
	// Body - raw - JSON
	/*
		{
    			"name": "Adriana Silva",
    			"email": "adrianasilva@ifsp.edu.br",
    			"password": "$2a$10$Ot4XGuyPP7r82nN3WXA0bOL1Qk9gShKDlVuPoyp89HoFnHcwO4Tji",
    			"dateOfBirth": "03/10/2000",
    			"gender": "FEMININO",
    			"active": true
		}
	*/

	@GetMapping("/{id}")
	public ResponseEntity<Adocao> findById(@PathVariable Long id){
		Optional<Adocao> adocao = adocaoRepository.findById(id);
		if(adocao.isPresent()) {
			return ResponseEntity.ok(adocao.get());
		}
		return ResponseEntity.notFound().build();
	}

	// testar Postman
	// GET - http://localhost:8080/users/1
	// GET - http://localhost:8080/users/10

}