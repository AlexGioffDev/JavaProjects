package com.razeft.models;

public class NonPerishable extends  Product{
    private String content;
    private int shelfLife;

    public NonPerishable(String name, Double price, String content, int shelfLife) {
        super(name, price);
        this.content = content;
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nContent: ")
                .append(content)
                .append("\nShelflife: ")
                .append(shelfLife);
        return sb.toString();
    }
}
