package br.edu.ifspcjo.ads.web3.petshop.domain.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "pet")
public class Pet {
	
	@NotNull
	@Column(name = "idade")
	@JsonFormat(pattern =  "dd/MM/yyyy")
	 private LocalDate idade1;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String raca;
	

	
	@NotNull
	private String especie;
	
	@NotNull
	private String porte;
	
	@NotNull
	private Sexo sexo;
	
	@NotNull
	private Boolean vacina;	
	@NotNull
	private Boolean castracao;
	
	
	public LocalDate getIdade1() {
		return idade1;
	}
	public void setIdade1(LocalDate idade1) {
		this.idade1 = idade1;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	

	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Boolean getVacina() {
		return vacina;
	}
	public void setVacina(Boolean vacina) {
		this.vacina = vacina;
	}
	public Boolean getCastracao() {
		return castracao;
	}
	public void setCastracao(Boolean castracao) {
		this.castracao = castracao;
	}

}
