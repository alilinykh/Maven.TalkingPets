package io.zipcoder.polymorphism.Animals;

import io.zipcoder.polymorphism.Pet;

public class Panda extends Pet {
    public Panda(String name, String kind) {
        super(name, kind);
    }
    @Override
    public String speak() {
        return "I love bamboo";
    }
}
