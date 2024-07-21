package org.razeft.supermarketcart.models.product;

public class Dairy extends Product {

    private int quantity;
    private int proteins;

    public Dairy(String name, Double price, int quantity, int proteins) {
        super(name, price);
        this.quantity = quantity;
        this.proteins = proteins;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getProteins() {
        return proteins;
    }
}
