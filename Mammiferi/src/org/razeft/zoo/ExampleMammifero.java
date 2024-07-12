package org.razeft.zoo;

import org.razeft.zoo.models.*;
import org.razeft.zoo.models.bases.Canine;
import org.razeft.zoo.models.bases.Feline;
import org.razeft.zoo.models.bases.Mammifero;

public class ExampleMammifero {
    public static void main(String[] args) {
        Mammifero[] mammiferos = new Mammifero[6];

        mammiferos[0] = new Lion("Savannah", 1.2f, 2.5f, 190.0f, "Panthera leo", 4.0f, 60, 15, 114.0f);
        mammiferos[1] = new Cheetah("Grasslands", 0.9f, 1.5f, 72.0f, "Acinonyx jubatus", 3.5f, 120);
        mammiferos[2] = new AfricanDog("Savannah", 0.75f, 1.0f, 25.0f, "Lycaon pictus", "Brown and White", 2.0f, 317);
        mammiferos[3] = new Tiger("Forest", 1.0f, 3.0f, 220.0f, "Panthera tigris", 4.5f, 65, "Bengal Tiger");
        mammiferos[4] = new Wolf("Mountains", 0.8f, 1.6f, 40.0f, "Canis lupus", "Grey", 3.0f, "Gray Wolf", 5);
        mammiferos[5] = new Lion("Savannah", 1.2f, 2.5f, 185.0f, "Panthera leo", 4.0f, 58, 12, 110.0f);

        for(Mammifero mammifero: mammiferos){
            System.out.println("Details:");
            System.out.println("Scientific Name: " +mammifero.getScientificName());
            System.out.println("Habitat: " + mammifero.getHabitat());
            System.out.println("Height: " + String.format("%.2f", mammifero.getHeight()) + " meters");
            System.out.println("Length: " + String.format("%.2f", mammifero.getLength()) + " meters");
            System.out.println("Weight: " + String.format("%.2f", mammifero.getWeight()) + " kilograms");

            if(mammifero instanceof Feline) {
                Feline feline = (Feline) mammifero;
                System.out.println("Claw Size: " + String.format("%.2f", feline.getClawSize()) + " centimeters");
                System.out.println("Speed: " + feline.getSpeed() + " km/h");

                if(feline instanceof Lion) {
                    Lion lion = (Lion) feline;
                    System.out.println("Pride Number: " + lion.getPrideNumber());
                    System.out.println("Roar Power: " + String.format("%.2f", lion.getRoarPower()) + " decibels");
                }

                if(feline instanceof Tiger) {
                    Tiger tiger = (Tiger) feline;
                    System.out.println("Tiger Species: " + tiger.getTigerSpecies());
                }
            }

            if(mammifero instanceof Canine) {
                Canine canine = (Canine) mammifero;

                System.out.println("Color: " + canine.getColor());
                System.out.println("Canine Size: " + String.format("%.2f", canine.getCanineSize()) + " centimeters");

                if(canine instanceof Wolf) {
                    Wolf wolf = (Wolf) canine;
                    System.out.println("Wolf species: " + wolf.getWolfSpecies());
                    System.out.println("Litter Number: " + wolf.getLitterNumber());
                }

                if(canine instanceof AfricanDog) {
                    AfricanDog africanDog = (AfricanDog) canine;
                    System.out.println("Bite force " + africanDog.getBiteForce() + " psi");
                }
            }

            System.out.println("--------------------------------------");
        }


    }
}
