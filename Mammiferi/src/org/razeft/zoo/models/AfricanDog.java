package org.razeft.zoo.models;

import org.razeft.zoo.models.bases.Canine;

public class AfricanDog extends Canine {
    private int biteForce;


    public AfricanDog(String habitat, float height, float length, float weight, String scientificName, String color, float canineSize, int biteForce) {
        super(habitat, height, length, weight, scientificName, color, canineSize);
        this.biteForce = biteForce;
    }

    public int getBiteForce() {
        return biteForce;
    }

    public void setBiteForce(int biteForce) {
        this.biteForce = biteForce;
    }

    @Override
    public String eat() {
        return "The African Wild Dog hunts in packs and uses its strong bite force of " + biteForce + " psi to take down prey.";
    }

    @Override
    public String sleep() {
        return "The African Wild Dog sleeps in the open savannas of " + habitat + ".";
    }

    @Override
    public String run() {
        return "The African Wild Dog runs tirelessly across the " + habitat + " to hunt.";
    }

    @Override
    public String communicate() {
        return "The African Wild Dog uses a series of high-pitched calls to communicate with its pack.";
    }
}
