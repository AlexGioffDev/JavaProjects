package com.razeft.models;

public class Product {
    protected String name;
    protected  Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Product:")
                .append("\nName:")
                .append(name)
                .append("\nPrice: $")
                .append(String.format("%.2f", price));
        return sb.toString();
    }
}
