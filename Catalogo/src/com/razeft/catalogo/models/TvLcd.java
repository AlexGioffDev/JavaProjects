package com.razeft.catalogo.models;

import com.razeft.catalogo.models.abstracts.Electronic;

public class TvLcd extends Electronic {

    private int inch;

    public TvLcd(int price, String manufacturer, int inch) {
        super(price, manufacturer);
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    @Override
    public double getSalePrice() {
        return this.getPrice() * 0.5;
    }
}
