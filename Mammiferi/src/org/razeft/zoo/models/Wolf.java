package org.razeft.zoo.models;

import org.razeft.zoo.models.bases.Canine;

public class Wolf extends Canine {

    private int litterNumber;
    private String wolfSpecies;

    public Wolf(String habitat, float height, float length, float weight, String scientificName, String color, float canineSize, String wolfSpecies, int litterNumber) {
        super(habitat, height, length, weight, scientificName, color, canineSize);
        this.wolfSpecies = wolfSpecies;
        this.litterNumber = litterNumber;
    }

    public int getLitterNumber() {
        return litterNumber;
    }

    public void setLitterNumber(int litterNumber) {
        this.litterNumber = litterNumber;
    }

    public String getWolfSpecies() {
        return wolfSpecies;
    }

    public void setWolfSpecies(String wolfSpecies) {
        this.wolfSpecies = wolfSpecies;
    }

    @Override
    public String eat() {
        return "The Wolf hunts in packs and shares the prey with its litter of " + litterNumber + " pups.";
    }

    @Override
    public String sleep() {
        return "The Wolf with " + color + " fur sleeps in the caves of " + habitat + ".";
    }

    @Override
    public String run() {
        return "The Wolf runs swiftly across the " + habitat + " in search of food.";
    }

    @Override
    public String communicate() {
        return "The " + wolfSpecies + " Wolf howls to communicate with its pack.";
    }
}
