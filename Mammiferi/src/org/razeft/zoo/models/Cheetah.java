package org.razeft.zoo.models;

import org.razeft.zoo.models.bases.Feline;

public class Cheetah extends Feline {


    public Cheetah(String habitat, float height, float length, float weight, String scientificName, float clawSize, int speed) {
        super(habitat, height, length, weight, scientificName, clawSize, speed);
    }

    @Override
    public String eat() {
        return "The Cheetah hunts alone, relying on its incredible speed to catch prey.";
    }

    @Override
    public String sleep() {
        return "The Cheetah sleeps in the tall grass of the " + habitat + " to stay hidden.";
    }

    @Override
    public String run() {
        return "The Cheetah runs at a breathtaking speed of " + speed + " km/h, the fastest of all land animals.";
    }

    @Override
    public String communicate() {
        return "The Cheetah uses a variety of vocalizations to communicate with others.";
    }
}
