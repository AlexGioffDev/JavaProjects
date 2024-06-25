package com.razeft.appfattura.models;

public class Prodotto {
    private int codigo;
    private String nome;
    private float prezzo;
    private static int ultimocodigo;


    public Prodotto() {
        this.codigo = ++ultimocodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return codigo +
                "\t" + nome +
                "\t" + prezzo;
    }
}
