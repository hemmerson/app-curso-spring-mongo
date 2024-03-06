package com.hemmersonrosa.appcursospringmongo.dto;

import com.hemmersonrosa.appcursospringmongo.domains.Aluno;

import java.io.Serializable;

public class AlunoDTO implements Serializable {

    private String numero_aluno;
    private String alunome;
    private String alurua;
    private String alucidade;

    public AlunoDTO() {
    }

    public AlunoDTO(Aluno obj) {
        this.numero_aluno = obj.getNumero_aluno();
        this.alunome = obj.getAlunome();
        this.alurua = obj.getAlurua();
        this.alucidade = obj.getAlucidade();
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
}
