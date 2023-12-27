package com.sidneydev.clientes.model.repository;

import com.sidneydev.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByUsername(String username);

    // SELECT COUNT(*) > 0 FROM usuario WHERE username = :login
    boolean existsByUserName(String username);
}
