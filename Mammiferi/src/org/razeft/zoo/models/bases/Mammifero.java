package org.razeft.zoo.models.bases;

abstract public class Mammifero {

    protected String habitat;
    protected float height;
    protected float length;
    protected float weight;
    protected String scientificName;

    public Mammifero(String habitat, float height, float length, float weight, String scientificName) {
        this.habitat = habitat;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.scientificName = scientificName;
    }

    public String getHabitat() {
        return this.habitat;
    };
    public double getHeight(){
        return this.height;
    };
    public double getLength(){
        return this.length;
    };
    public double getWeight() {
        return this.weight;
    };
    public String getScientificName(){
        return this.scientificName;
    };

    abstract public String eat();
    abstract public String sleep();
    abstract public String run();
    abstract public String communicate();

}
