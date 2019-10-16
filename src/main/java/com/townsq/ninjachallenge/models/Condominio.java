package com.townsq.ninjachallenge.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CONDOMINIOS")
public class Condominio extends EntidadeBase {

    @NotBlank(message = "Condomínio é obrigatório")
    @Column(nullable = false, name = "NOMES")
    private String nome;

    public Condominio() {
    }

    public Condominio(Long id, @NotBlank(message = "Condomínio é obrigatório") String nome) {
        super(id);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Condominio{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
