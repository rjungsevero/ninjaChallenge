package com.townsq.ninjachallenge.repositories;

import com.townsq.ninjachallenge.models.Grupo;
import com.townsq.ninjachallenge.models.Permissoes;
import com.townsq.ninjachallenge.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {

    List<Grupo> findByPermissoes(Usuario usuario);

}
