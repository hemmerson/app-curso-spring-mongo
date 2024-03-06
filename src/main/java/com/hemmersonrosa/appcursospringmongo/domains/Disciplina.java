package com.hemmersonrosa.appcursospringmongo.domains;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Objects;

public class Disciplina implements Serializable {

    @Id
    private String codigo_disc;
    private String nome_disciplina;
    private String nome_curso;
    private Integer qtd_aulas;

    public Disciplina() {
    }

    public Disciplina(String nome_disciplina, String nome_curso, Integer qtd_aulas) {
        this.nome_disciplina = nome_disciplina;
        this.nome_curso = nome_curso;
        this.qtd_aulas = qtd_aulas;
    }

    public Disciplina(String codigo_disc, String nome_disciplina, String nome_curso, Integer qtd_aulas) {
        this.codigo_disc = codigo_disc;
        this.nome_disciplina = nome_disciplina;
        this.nome_curso = nome_curso;
        this.qtd_aulas = qtd_aulas;
    }

    public String getCodigo_disc() {
        return codigo_disc;
    }

    public void setCodigo_disc(String codigo_disc) {
        this.codigo_disc = codigo_disc;
    }

    public String getNome_disciplina() {
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public Integer getQtd_aulas() {
        return qtd_aulas;
    }

    public void setQtd_aulas(Integer qtd_aulas) {
        this.qtd_aulas = qtd_aulas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(codigo_disc, that.codigo_disc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo_disc);
    }
}
