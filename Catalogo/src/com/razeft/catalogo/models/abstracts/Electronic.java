package com.razeft.catalogo.models;

import com.razeft.catalogo.models.interfaces.IElectronic;

abstract public class Electronic extends Product implements IElectronic {

    private String manufacturer;

    public Electronic(int price, String manufacturer) {
        super(price);
        this.manufacturer = manufacturer;
    }

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }
}
