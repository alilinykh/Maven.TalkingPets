package io.zipcoder.polymorphism;

public class Cat extends Pet {
    public Cat(String name, String kind) {
        super(name, kind);
    }
    @Override
    public void speak() {
        System.out.println("cat speak");
    }
}
