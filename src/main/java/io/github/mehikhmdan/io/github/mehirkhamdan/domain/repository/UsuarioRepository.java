package io.github.mehikhmdan.io.github.mehirkhamdan.domain.repository;

import io.github.mehikhmdan.io.github.mehirkhamdan.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByLogin(String login);
}
