package com.hemmersonrosa.appcursospringmongo.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Professor implements Serializable {

    @Id
    private String numero_prof;
    private String profnome;
    private String profrua;
    private String profcidade;

    public Professor(String profnome, String profrua, String profcidade) {
        this.profnome = profnome;
        this.profrua = profrua;
        this.profcidade = profcidade;
    }
}
