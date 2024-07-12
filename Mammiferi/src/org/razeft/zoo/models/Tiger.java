package org.razeft.zoo.models;

import org.razeft.zoo.models.bases.Feline;

public class Tiger extends Feline {

    private String tigerSpecies;


    public Tiger(String habitat, float height, float length, float weight, String scientificName, float clawSize, int speed, String tigerSpecies) {
        super(habitat, height, length, weight, scientificName, clawSize, speed);
        this.tigerSpecies = tigerSpecies;
    }

    public String getTigerSpecies() {
        return tigerSpecies;
    }

    public void setTigerSpecies(String tigerSpecies) {
        this.tigerSpecies = tigerSpecies;
    }

    @Override
    public String eat() {
        return "The " +tigerSpecies + " Tiger stealthily hunts in the dense forests.";
    }

    @Override
    public String sleep() {
        return "The " + tigerSpecies + " Tiger sleeps in the cool shade of the " + habitat + ".";
    }

    @Override
    public String run() {
        return "The " + tigerSpecies + " Tiger runs at " + speed + " km/h to capture its prey.";
    }

    @Override
    public String communicate() {
        return "The " + tigerSpecies + " Tiger growls to mark its territory.";
    }
}
