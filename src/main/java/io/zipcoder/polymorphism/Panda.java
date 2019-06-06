package io.zipcoder.polymorphism;

public class Panda extends Pet {
    public Panda(String name, String kind) {
        super(name, kind);
    }
    @Override
    public void speak() {
        System.out.println("panda speak");
    }
}
