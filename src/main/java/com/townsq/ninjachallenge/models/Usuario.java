package com.townsq.ninjachallenge.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "USUARIOS")
@JsonIgnoreProperties
public class Usuario extends EntidadeBase {

    @JsonProperty
    @Email
    @NotBlank(message = "Username é obrigatório")
    @Column(nullable = false, name = "USERNAME", length = 50)
    private String username;

    @JsonProperty
    @ManyToMany
    private List<Grupo> grupos;

    public Usuario(Long id) {
        super(id);
    }

    public Usuario() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "Usuario{username='" + username + ", grupos=" + grupos + "}";
    }
}
