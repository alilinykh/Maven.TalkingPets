package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog(String name, String kind) {
        super(name, kind);
    }
    @Override
    public void speak() {
        System.out.println("dog speak");
    }
}
