package com.townsq.ninjachallenge.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PERMISSOES")
public class Permissoes extends EntidadeBase {
    private static final long serialVersionUID = 1L;

    @NotBlank(message = "Funcionalidade é obrigatório")
    @Column(nullable = false, name = "FUNCIONALIDADES")
    private String nome;

    @NotBlank(message = "Permissão é obrigatório")
    @Column(nullable = false, name = "PERMISSOES")
    private String permissao;

    public Permissoes() {
    }

    public Permissoes(Long id, @NotBlank String nome) {
        super(id);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    @Override
    public String toString() {
        return "(" + nome + ", " + permissao + ")";
    }
}
