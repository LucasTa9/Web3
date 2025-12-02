package br.edu.ifspcjo.ads.web3.petshop.domain.model;

public enum Sexo {
	MACHO("Macho"),
	FEMEA("Femea");
	
	
	private String description;

	private Sexo(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
