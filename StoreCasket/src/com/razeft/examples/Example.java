package com.razeft.examples;

import com.razeft.models.*;

public class Example {

    public static void main(String[] args) {
        Product[] casket = {
                new Fruit("Apple", 1.5, "Red", 0.3),
                new Fruit("Banana", 1.2, "Yellow", 0.25),
                new CleaningProduct("Detergent", 3.5, "Chemical", 1.0),
                new CleaningProduct("Disinfectant", 3.5, "Chemical", 1.5),
                new DairyProduct("Milk", 0.8, 1, 3.0),
                new DairyProduct("Yogurt", 0.5, 2, 4.5),
                new NonPerishable("Rice", 2.0, "Grain", 365),
                new NonPerishable("Lentils", 1.8, "Grain", 180)
        };

        for(Product product : casket) {
            System.out.println(product);
        }
    }
}
