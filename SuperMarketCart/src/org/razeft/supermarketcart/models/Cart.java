package org.razeft.supermarketcart.models;

import java.util.ArrayList;
import java.util.List;

public class Cart<T>  {

    private List<T> products;
    public static int MAX_ELEMENTS = 5;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void AddProduct(T prod) {
        if(this.products.size() < MAX_ELEMENTS){
            this.products.add(prod);
        } else {
            throw new RuntimeException("The cart is full");
        }
    }

    public List<T> getProducts() {
        return this.products;
    }
}
