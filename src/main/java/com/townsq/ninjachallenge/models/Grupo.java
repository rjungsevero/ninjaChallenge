package com.townsq.ninjachallenge.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;


@Entity
@Table(name = "GRUPOS")
public class Grupo extends EntidadeBase {

    @NotBlank(message = "Grupo é obrigatório")
    @Column(nullable = false, name = "TIPOS")
    private String tipo;

    @ManyToMany
    private List<Permissoes> permissoes;

    @ManyToOne
    private Condominio condominios;

    public Grupo() {
    }

    public Grupo(Long id, @NotBlank(message = "Grupo é obrigatório") String tipo, List<Permissoes> permissoes, Condominio condominios) {
        super(id);
        this.tipo = tipo;
        this.permissoes = permissoes;
        this.condominios = condominios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Permissoes> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<Permissoes> permissoes) {
        this.permissoes = permissoes;
    }

    public Condominio getCondominios() {
        return condominios;
    }

    public void setCondominios(Condominio condominios) {
        this.condominios = condominios;
    }

    @Override
    public String toString() {
        return getCondominios().getId() + "; " + permissoes;
    }
}
