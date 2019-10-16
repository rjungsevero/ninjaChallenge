package com.townsq.ninjachallenge.services;

import com.townsq.ninjachallenge.models.Grupo;
import com.townsq.ninjachallenge.models.Usuario;
import com.townsq.ninjachallenge.repositories.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {

    private GrupoRepository grupoRepository;

    GrupoService(GrupoRepository grupoRepository){
        this.grupoRepository = grupoRepository;
    }

    public List<Grupo> buscaGruposDeUsuario(Usuario usuario){
        List<Grupo> grupos = grupoRepository.findByPermissoes(usuario);
        return grupos;
    }
}
