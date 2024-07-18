package com.razeft.catalogo.models;

import java.util.Date;

public class Comics extends Book {
    private String character;

    public Comics(int price, Date publicationDate, String author, String title, String publisher, String character) {
        super(price, publicationDate, author, title, publisher);
        this.character = character;
    }

    @Override
    public double getSalePrice() {
        return this.getPrice() * 0.93;
    }

    public String getCharacter() {
        return character;
    }
}
