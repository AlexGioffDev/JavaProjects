package org.razeft.totalCart;

import org.razeft.totalCart.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ExampleTotalCart {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(32.00, 2));
        products.add(new Product(4.00, 4));
        products.add(new Product(12.00, 1));
        products.add(new Product(8.00, 1));
        products.add(new Product(1.50, 2));

        double resultado = products.stream()
                .map(p -> p.getPrize() * p.getQuantity())
                .reduce(0.0, Double::sum);

        System.out.println("the total is: $" +resultado );
    }
}
