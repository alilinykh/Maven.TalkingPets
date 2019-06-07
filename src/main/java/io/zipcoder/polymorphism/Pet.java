package io.zipcoder.polymorphism;
abstract public class Pet {
    String name;
    String kind;

    public Pet(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

abstract public String speak ();

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
