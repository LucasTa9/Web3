package br.edu.ifspcjo.ads.web3.tarefa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.web3.tarefa1.domain.model.Tarefa;


public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}