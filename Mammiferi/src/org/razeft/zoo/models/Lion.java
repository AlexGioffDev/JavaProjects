package org.razeft.zoo.models;

import org.razeft.zoo.models.bases.Feline;

public class Lion extends Feline {

    private int prideNumber;
    private float roarPower;

    public Lion(String habitat, float height, float length, float weight, String scientificName, float clawSize, int speed, int prideNumber, float roarPower) {
        super(habitat, height, length, weight, scientificName, clawSize, speed);
        this.prideNumber = prideNumber;
        this.roarPower = roarPower;
    }

    public int getPrideNumber() {
        return prideNumber;
    }

    public void setPrideNumber(int prideNumber) {
        this.prideNumber = prideNumber;
    }

    public float getRoarPower() {
        return roarPower;
    }

    public void setRoarPower(float roarPower) {
        this.roarPower = roarPower;
    }

    @Override
    public String eat() {
        return "The Lion hunts together with its pride of " + prideNumber + " members in the African Savannas";
    }

    @Override
    public String sleep() {
        return "The Lion sleeps in the " + habitat + ", blending into the environment.";
    }

    @Override
    public String run() {
        return "The lion runs at " + speed + " km/h to chase down its prey.";
    }

    @Override
    public String communicate() {
        return "The lion's roar reaches " + roarPower + " decibels, echoing through the savannas.";
    }
}
