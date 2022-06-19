package io.github.mehikhmdan.io.github.mehirkhamdan.domain.repository;

import io.github.mehikhmdan.io.github.mehirkhamdan.domain.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
