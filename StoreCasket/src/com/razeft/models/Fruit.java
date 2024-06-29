package com.razeft.models;

public class Fruit extends Product {
    private String color;
    private Double weight;

    public Fruit(String name, Double price, String color, Double weight) {
        super(name, price);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nColor: ")
                .append(color)
                .append("\nWeight: ")
                .append(weight);
        return sb.toString();
    }
}
