package com.townsq.ninjachallenge.controllers;

import com.townsq.ninjachallenge.models.Usuario;
import com.townsq.ninjachallenge.services.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@Api(value = "API REST Ninja Challenge")
@CrossOrigin(origins = "*")
public class UsuarioRestController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    @ApiOperation("Retorna todos os usuários do sistema")
    public ResponseEntity<List<Usuario>> listaUsuarios() {
        List<Usuario> usuarios = usuarioService.buscarTodosUsuarios();
        return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
    }

    @GetMapping("/{username}")
    @ApiParam("Utilize o email do usuário como parametro")
    @ApiOperation("Retorna um usuário específico")
    public ResponseEntity<String> buscaPermissoesDeUsuarioPorEmail(@PathVariable("username") String username) throws Exception {
        try {
            Usuario user = usuarioService.buscaDeUsuarioPorEmail(username);
            return new ResponseEntity<String>(user.getGrupos().toString(), HttpStatus.OK);
        } catch (Exception exception) {
            throw new Exception("Error find search user.", exception);
        }
    }


}
