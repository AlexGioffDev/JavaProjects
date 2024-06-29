package com.razeft.models;

public class CleaningProduct extends  Product{
    private String content;
    private Double volume;

    public CleaningProduct(String name, Double price, String content, Double volume) {
        super(name, price);
        this.content = content;
        this.volume = volume;
    }

    public String getContent() {
        return content;
    }

    public Double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nContent: ")
                .append(content)
                .append("\nVolume: ")
                .append(volume);
        return sb.toString();
    }
}
