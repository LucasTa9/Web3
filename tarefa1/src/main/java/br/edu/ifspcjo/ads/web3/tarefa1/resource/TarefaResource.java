package br.edu.ifspcjo.ads.web3.tarefa1.resource;

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

import br.edu.ifspcjo.ads.web3.tarefa1.domain.model.Tarefa;
import br.edu.ifspcjo.ads.web3.tarefa1.repository.TarefaRepository;
import jakarta.validation.Valid;

@RestController 
@RequestMapping("/tasks") 
public class TarefaResource 
{

	@Autowired
	private TarefaRepository tarefaRepository;
	
	@GetMapping
	public List<Tarefa> list(){
		return tarefaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tarefa> findById(@PathVariable Long id) 
	{
		Optional<Tarefa> tarefa = tarefaRepository.findById(id);
		
		if(tarefa.isPresent()) {
			return ResponseEntity.ok(tarefa.get());
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Tarefa create(@Valid @RequestBody Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
	

	
}