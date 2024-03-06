package com.hemmersonrosa.appcursospringmongo.domain;

import java.io.Serializable;
import java.util.Objects;

public class Professor implements Serializable {
    private String numero_prof;
    private String profnome;
    private String profrua;
    private String profcidade;

    public Professor() {
    }

    public Professor(String numero_prof, String profnome, String profrua, String profcidade) {
        this.numero_prof = numero_prof;
        this.profnome = profnome;
        this.profrua = profrua;
        this.profcidade = profcidade;
    }

    public Professor(String profnome, String profrua, String profcidade) {
        this.profnome = profnome;
        this.profrua = profrua;
        this.profcidade = profcidade;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(numero_prof, professor.numero_prof);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero_prof);
    }
}
