package org.razeft.totalCart.models;

public class Product {
    private double prize;
    private int quantity;

    public Product(double prize, int quantity) {
        this.prize = prize;
        this.quantity = quantity;
    }

    public double getPrize() {
        return prize;
    }

    public int getQuantity() {
        return quantity;
    }
}
