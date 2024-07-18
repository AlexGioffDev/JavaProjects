package com.razeft.catalogo.models.abstracts;

import com.razeft.catalogo.models.interfaces.IProduct;

public abstract class Product implements IProduct {

    private int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
