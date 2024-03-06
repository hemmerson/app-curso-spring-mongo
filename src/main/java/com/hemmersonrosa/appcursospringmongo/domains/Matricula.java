package com.hemmersonrosa.appcursospringmongo.domains;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Objects;

public class Matricula implements Serializable {

    @Id
    private String id;
    private Aluno aluno;
    private Disciplina disciplina;
    private Integer ano;

    public Matricula() {
    }

    public Matricula(Aluno aluno, Disciplina disciplina, Integer ano) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.ano = ano;
    }

    public Matricula(String id, Aluno aluno, Disciplina disciplina, Integer ano) {
        this.id = id;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.ano = ano;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(id, matricula.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
