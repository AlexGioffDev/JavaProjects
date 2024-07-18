package com.razeft.catalogo.models;

import com.razeft.catalogo.models.abstracts.Product;
import com.razeft.catalogo.models.interfaces.IBook;

import java.util.Date;

public class Book extends Product implements IBook {

    private Date publicationDate;
    private String author;
    private String title;
    private String publisher;

    public Book(int price, Date publicationDate, String author, String title, String publisher) {
        super(price);
        this.publicationDate = publicationDate;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    @Override
    public Date getPublicationDate() {
        return this.publicationDate;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getPublisher() {
        return this.publisher;
    }

    @Override
    public double getSalePrice() {
        return this.getPrice() * 0.5;
    }
}
