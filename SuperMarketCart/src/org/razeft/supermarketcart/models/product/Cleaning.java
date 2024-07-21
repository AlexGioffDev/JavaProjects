package org.razeft.supermarketcart.models.product;

public class Cleaning  extends Product{

    private String components;
    private Double liters;

    public Cleaning(String name, Double price, String components, Double liters) {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }

    public String getComponents() {
        return components;
    }

    public Double getLiters() {
        return liters;
    }
}
