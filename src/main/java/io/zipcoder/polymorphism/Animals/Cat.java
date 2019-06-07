package io.zipcoder.polymorphism.Animals;

import io.zipcoder.polymorphism.Pet;

public class Cat extends Pet {
    public Cat(String name, String kind) {
        super(name, kind);
    }
    //@Override
    public String speak() {
        return "Bonjour";
    }
}
