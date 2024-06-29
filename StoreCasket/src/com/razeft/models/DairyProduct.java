package com.razeft.models;

public class DairyProduct extends  Product {
    private int quantity;
    private Double proteins;

    public DairyProduct(String name, Double price, int quantity, Double proteins) {
        super(name, price);
        this.quantity = quantity;
        this.proteins = proteins;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getProteins() {
        return proteins;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nQuantity: ")
                .append(quantity)
                .append("\nProteins: ")
                .append(proteins);
        return sb.toString();
    }
}
