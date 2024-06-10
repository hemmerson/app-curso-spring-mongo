package com.hemmersonrosa.appcursospringmongo.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode
public class Aluno implements Serializable {

    @Id
    private String numero_aluno;
    private String alunome;
    private String alurua;
    private String alucidade;


    public Aluno(String alunome, String alurua, String alucidade) {
        this.alunome = alunome;
        this.alurua = alurua;
        this.alucidade = alucidade;
    }
}
