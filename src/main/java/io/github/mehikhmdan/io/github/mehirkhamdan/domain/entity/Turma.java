package io.github.mehikhmdan.io.github.mehirkhamdan.domain.entity;

import io.github.mehikhmdan.io.github.mehirkhamdan.domain.enums.Turno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name =  "id")
    private Integer id;

    @Column(name = "nome", length = 100)
    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String Descricao;

    @Column(name = "ano", length = 4)
    @NotEmpty(message = "{campo.ano.obrigatorio}")
    private String ano;

    @Enumerated(EnumType.STRING)
    @Column(name = "turno")
    private Turno turno;


}
