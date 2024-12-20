package com.townsq.ninjachallenge.services;

import com.townsq.ninjachallenge.models.Usuario;
import com.townsq.ninjachallenge.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> buscarTodosUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario buscaDeUsuarioPorEmail(String username) throws Exception {
        try {
            Usuario usuario = usuarioRepository.findByUsername(username);
            return usuario;
        }catch (Exception exception){
            throw new Exception("Error find search user.", exception);
        }

    }
}
