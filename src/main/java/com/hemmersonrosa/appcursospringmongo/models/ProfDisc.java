package com.hemmersonrosa.appcursospringmongo.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ProfDisc implements Serializable {

    @Id
    private String id;
    private Professor professor;
    private Disciplina disciplina;
    private Integer ano;

    public ProfDisc(Professor professor, Disciplina disciplina, Integer ano) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.ano = ano;
    }
}
