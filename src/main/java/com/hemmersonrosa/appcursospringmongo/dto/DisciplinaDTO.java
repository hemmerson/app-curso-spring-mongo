package com.hemmersonrosa.appcursospringmongo.dto;

import com.hemmersonrosa.appcursospringmongo.domains.Aluno;
import com.hemmersonrosa.appcursospringmongo.domains.Disciplina;

import java.io.Serializable;

public class DisciplinaDTO implements Serializable {

    private String codigo_disc;
    private String nome_disciplina;
    private String nome_curso;
    private Integer qtd_aulas;

    public DisciplinaDTO() {
    }

    public DisciplinaDTO(Disciplina obj) {
        this.codigo_disc = obj.getCodigo_disc();
        this.nome_disciplina = obj.getNome_disciplina();
        this.nome_curso = obj.getNome_curso();
        this.qtd_aulas = obj.getQtd_aulas();
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
}
