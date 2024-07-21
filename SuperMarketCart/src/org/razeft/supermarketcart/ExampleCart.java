package org.razeft.supermarketcart;

import org.razeft.supermarketcart.models.Cart;
import org.razeft.supermarketcart.models.product.Fruit;

public class ExampleCart {
    public static void main(String[] args) {
        Cart<Fruit> cartFruits = new Cart<>();
        cartFruits.AddProduct(new Fruit("banana", 2.50, 1.5, "yellow"));
        cartFruits.AddProduct(new Fruit("apple", 3.00, 1.5, "red"));
        Double total = 0.0;
        for(Fruit fruit: cartFruits.getProducts()) {
            System.out.println(fruit.getName() + " " + fruit.getColor() + ": " +fruit.getWeight() +"kg - $" +fruit.getPrice());
            total += fruit.getPrice();
        }

        System.out.println("\ntotal: $" +total);
    }
}
