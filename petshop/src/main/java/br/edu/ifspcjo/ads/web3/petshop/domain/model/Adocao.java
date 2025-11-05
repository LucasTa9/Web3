package br.edu.ifspcjo.ads.web3.petshop.domain.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "adocao")
public class Adocao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id") // coluna no banco
    private User adotante;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "pet_id") // coluna no banco
    private Pet pet;

    @NotNull
    @Column(name = "date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAdocao;

    @NotNull
    @Enumerated(EnumType.STRING)
    private StatusAdocao status;

    @NotNull
    @Column(name = "observation")
    private String observacoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getAdotante() {
		return adotante;
	}

	public void setAdotante(User adotante) {
		this.adotante = adotante;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public LocalDate getDataAdocao() {
		return dataAdocao;
	}

	public void setDataAdocao(LocalDate dataAdocao) {
		this.dataAdocao = dataAdocao;
	}

	public StatusAdocao getStatus() {
		return status;
	}

	public void setStatus(StatusAdocao status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

    // getters e setters...
}