package br.edu.ifspcjo.ads.web3.petshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.web3.petshop.domain.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}

