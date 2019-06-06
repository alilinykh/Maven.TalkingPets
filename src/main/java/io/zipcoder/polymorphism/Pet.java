package io.zipcoder.polymorphism;

public class Pet {
    String name;
    String kind;

    public Pet(String name, String kind) {
        this.name = "Pet";
        this.kind = "Animal";
    }

    public void speak () {
        System.out.println("Where are my bagels???");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
