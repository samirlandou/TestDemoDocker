package com.example.demodocker.domain;

import java.util.Objects;

public class PessoaDomain {
    
    private String nome;
    private String sobreNome;

    public PessoaDomain() {
    }

    public PessoaDomain(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return this.sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public PessoaDomain nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaDomain sobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PessoaDomain)) {
            return false;
        }
        PessoaDomain pessoaDomain = (PessoaDomain) o;
        return Objects.equals(nome, pessoaDomain.nome) && Objects.equals(sobreNome, pessoaDomain.sobreNome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobreNome);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", sobreNome='" + getSobreNome() + "'" +
            "}";
    }

    

}
