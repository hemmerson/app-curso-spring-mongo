package com.hemmersonrosa.appcursospringmongo.domains;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Objects;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode
public class Disciplina implements Serializable {

    @Id
    private String codigo_disc;
    private String nome_disciplina;
    private String nome_curso;
    private Integer qtd_aulas;

    public Disciplina(String nome_disciplina, String nome_curso, Integer qtd_aulas) {
        this.nome_disciplina = nome_disciplina;
        this.nome_curso = nome_curso;
        this.qtd_aulas = qtd_aulas;
    }
}
