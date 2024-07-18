package com.razeft.catalogo.models;

import com.razeft.catalogo.models.abstracts.Electronic;

public class IPhone extends Electronic {

    private String color;
    private String model;

    public IPhone(int price, String manufacturer, String model, String color) {
        super(price, manufacturer);
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getSalePrice() {
        return this.getPrice() * 0.9;
    }
}
