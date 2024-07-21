package org.razeft.supermarketcart.models.product;

public class NoPerecible extends Product{

    private int content;
    private int calories;

    public NoPerecible(String name, Double price, int content, int calories) {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }

    public int getContent() {
        return content;
    }

    public int getCalories() {
        return calories;
    }
}
