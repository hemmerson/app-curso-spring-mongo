package com.hemmersonrosa.appcursospringmongo.dto;

import com.hemmersonrosa.appcursospringmongo.domains.Professor;

import java.io.Serializable;

public class ProfessorDTO implements Serializable {

    private String numero_prof;
    private String profnome;
    private String profrua;
    private String profcidade;

    public ProfessorDTO(){
    }

    public ProfessorDTO(Professor obj) {
        this.numero_prof = obj.getNumero_prof();
        this.profnome = obj.getProfnome();
        this.profrua = obj.getProfrua();
        this.profcidade = obj.getProfcidade();
    }

    public String getNumero_prof() {
        return numero_prof;
    }

    public void setNumero_prof(String numero_prof) {
        this.numero_prof = numero_prof;
    }

    public String getProfnome() {
        return profnome;
    }

    public void setProfnome(String profnome) {
        this.profnome = profnome;
    }

    public String getProfrua() {
        return profrua;
    }

    public void setProfrua(String profrua) {
        this.profrua = profrua;
    }

    public String getProfcidade() {
        return profcidade;
    }

    public void setProfcidade(String profcidade) {
        this.profcidade = profcidade;
    }
}
