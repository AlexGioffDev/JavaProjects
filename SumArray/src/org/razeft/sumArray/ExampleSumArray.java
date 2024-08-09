package org.razeft.sumArray;

import java.util.stream.IntStream;

public class ExampleSumArray {
    public static void main(String[] args) {
        IntStream numbers = IntStream.rangeClosed(1, 100);

        double resultado = numbers
                .filter(num -> num % 10 != 0)
                .mapToDouble(num -> (double) num / 2)
                .reduce(0, Double::sum);

        System.out.println("El resultado es: " + resultado);
    }
}
