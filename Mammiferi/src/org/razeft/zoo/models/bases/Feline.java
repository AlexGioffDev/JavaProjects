package org.razeft.zoo.models.bases;

abstract public class Feline extends Mammifero {
    protected float clawSize;
    protected int speed;

    public Feline(String habitat, float height, float length, float weight, String scientificName, float clawSize, int speed) {
        super(habitat, height, length, weight, scientificName);
        this.clawSize = clawSize;
        this.speed = speed;
    }

    public float getClawSize() {
        return this.clawSize;
    }

    public int getSpeed() {
        return  this.speed;
    }
}
