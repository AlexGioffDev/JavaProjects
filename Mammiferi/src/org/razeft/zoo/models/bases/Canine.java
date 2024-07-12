package org.razeft.zoo.models.bases;

abstract public class Canine extends Mammifero{

    protected String color;
    protected float canineSize;

    public Canine(String habitat, float height, float length, float weight, String scientificName, String color, float canineSize) {
        super(habitat, height, length, weight, scientificName);
        this.color = color;
        this.canineSize = canineSize;
    }

    public String getColor() {
        return  this.color;
    }

    public float getCanineSize() {
        return this.canineSize;
    }

}
