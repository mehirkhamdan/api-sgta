package io.github.mehikhmdan.io.github.mehirkhamdan.domain.entity;

import io.github.mehikhmdan.io.github.mehirkhamdan.domain.enums.PessoaTipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name =  "id")
    private Integer id;

    @Column(name = "nome", length = 100)
    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String nome;

    @Column(name = "cpf", length = 11,nullable = false, unique = true)
    @NotEmpty(message = "{campo.cpf.obrigatorio}")
    @CPF(message = "{campo.cpf.invalido}")
    private String cpf;

    @Column(name = "telefone",length = 11, nullable = false, unique = true)
    @NotEmpty(message = "{campo.telefone.obrigatorio}")
    private String Telefone;

    @Column(name = "email", length = 100)
    @NotEmpty(message = "{campo.email.obrigatorio}")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private PessoaTipo tipo;

    //private Usuario usuario;
}
