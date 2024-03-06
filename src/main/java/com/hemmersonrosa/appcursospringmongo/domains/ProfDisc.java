package com.hemmersonrosa.appcursospringmongo.domains;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Objects;

public class ProfDisc implements Serializable {

    @Id
    private String id;
    private Professor professor;
    private Disciplina disciplina;
    private Integer ano;

    public ProfDisc() {
    }

    public ProfDisc(Professor professor, Disciplina disciplina, Integer ano) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.ano = ano;
    }

    public ProfDisc(String id, Professor professor, Disciplina disciplina, Integer ano) {
        this.id = id;
        this.professor = professor;
        this.disciplina = disciplina;
        this.ano = ano;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
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
        ProfDisc profDisc = (ProfDisc) o;
        return Objects.equals(id, profDisc.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
