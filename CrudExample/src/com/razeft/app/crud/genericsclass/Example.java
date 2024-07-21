package com.razeft.app.crud.genericsclass;

public class Example {
    public static void main(String[] args) {
        Camion<Animal> transportHorse = new Camion<>(5);

        transportHorse.add(new Animal("Flash", "Horse"));
        transportHorse.add(new Animal("Dre", "Horse"));

        for(Animal a: transportHorse) {
            System.out.println("Animal: " + a.getType() + " - name: " + a.getName());
        }
    }
}
