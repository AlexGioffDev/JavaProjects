package com.razeft.appfattura.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fattura {

    private int folio;
    private String description;
    private Date data;
    private Cliente cliente;
    private ItemFattura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Fattura(String description, Cliente cliente) {
        this.description = description;
        this.cliente = cliente;
        this.items = new ItemFattura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.data = new Date();
    }

    public int getFolio() {
        return folio;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFattura[] getItems() {
        return items;
    }

    public void addItemFattura(ItemFattura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcolareTotale() {
        float total = 0.0f;

        for (ItemFattura item : this.items) {
            if (item == null) {
                continue;
            }
            total += item.CalcolareImporto();
        }

        return total;
    }


    public String generareDettagli() {
        StringBuilder sb = new StringBuilder("Fattura N°: ");
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNome())
                .append("\t NIF: ")
                .append(this.cliente.getNif())
                .append("\nDescription: ")
                .append(this.description)
                .append("\n")
                .append("Data emissione: ")
                .append(df.format(this.data))
                .append("\n")
                .append("\n#\tNome\t$\tQuant.\tTotal\n");

        for(ItemFattura item: this.items) {
            if(item == null) {
                continue;
            }

            sb.append(item)
                    .append("\n");
        }

        sb.append("\nGran Total: ").append(calcolareTotale());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generareDettagli();
    }
}
