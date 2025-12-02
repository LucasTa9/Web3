package br.edu.ifspcjo.ads.web3.tarefa1.domain.model;

public enum StatusTarefa {

    NOVA("NOVA"),
    EM_ANDAMENTO("EM_ANDAMENTO"),
    CONCLUIDA("CONCLUIDA");

    private String status;

    StatusTarefa(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
