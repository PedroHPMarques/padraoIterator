package org.example;

public class Jogador {
    private String nome;
    private boolean relacionado;

    public Jogador(String nome, boolean relacionado) {
        this.nome = nome;
        this.relacionado = relacionado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isRelacionado() {
        return relacionado;
    }

    public void setRelacionado(boolean relacionado) {
        this.relacionado = relacionado;
    }
}
