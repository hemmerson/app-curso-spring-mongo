package com.hemmersonrosa.appcursospringmongo.domains;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Objects;

public class Aluno implements Serializable {

    @Id
    private String numero_aluno;
    private String alunome;
    private String alurua;
    private String alucidade;

    public Aluno() {
    }

    public Aluno(String alunome, String alurua, String alucidade) {
        this.alunome = alunome;
        this.alurua = alurua;
        this.alucidade = alucidade;
    }

    public Aluno(String numero_aluno, String alunome, String alurua, String alucidade) {
        this.numero_aluno = numero_aluno;
        this.alunome = alunome;
        this.alurua = alurua;
        this.alucidade = alucidade;
    }

    public String getNumero_aluno() {
        return numero_aluno;
    }

    public void setNumero_aluno(String numero_aluno) {
        this.numero_aluno = numero_aluno;
    }

    public String getAlunome() {
        return alunome;
    }

    public void setAlunome(String alunome) {
        this.alunome = alunome;
    }

    public String getAlurua() {
        return alurua;
    }

    public void setAlurua(String alurua) {
        this.alurua = alurua;
    }

    public String getAlucidade() {
        return alucidade;
    }

    public void setAlucidade(String alucidade) {
        this.alucidade = alucidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(numero_aluno, aluno.numero_aluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero_aluno);
    }
}
