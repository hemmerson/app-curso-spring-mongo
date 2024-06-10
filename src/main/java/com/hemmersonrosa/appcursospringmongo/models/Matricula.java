package com.hemmersonrosa.appcursospringmongo.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Matricula implements Serializable {

    @Id
    private String id;
    private Aluno aluno;
    private Disciplina disciplina;
    private Integer ano;

    public Matricula(Aluno aluno, Disciplina disciplina, Integer ano) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.ano = ano;
    }
}
