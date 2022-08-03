package com.utilizandoBeans.springbeans;

public class Autor {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirAutor() {
        System.out.println(this.nome);
    }
}
