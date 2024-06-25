package com.razeft.appfattura.models;

public class ItemFattura {

    private int quantita;
    private Prodotto prodotto;

    public ItemFattura(int quantita, Prodotto prodotto) {
        this.quantita = quantita;
        this.prodotto = prodotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }


    public float CalcolareImporto() {
        return this.quantita * this.prodotto.getPrezzo();
    }

    @Override
    public String toString() {
        return prodotto +
                "\t" + quantita +
                "\t" + CalcolareImporto();
    }
}


