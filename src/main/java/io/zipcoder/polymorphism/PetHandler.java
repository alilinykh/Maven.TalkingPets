package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Animals.Cat;
import io.zipcoder.polymorphism.Animals.Dog;
import io.zipcoder.polymorphism.Animals.Panda;

import java.util.ArrayList;
import java.util.Scanner;

public class PetHandler {
    private Integer numPets;
    private String name = "";
    private String kind = "";
    private ArrayList<Pet> pets = new ArrayList<Pet>();
    private Pet pet;


    public Integer getNumPets () {
        System.out.println("Please enter num of pets");
        Scanner sc = new Scanner(System.in);
        numPets = sc.nextInt();
        return numPets;
    }

    public void getPetInfo(Integer numPets) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter information about each pet you have");
        for (int i = 0; i < numPets; i++) {
            System.out.println("Enter pet's name: ");
            this.name = sc.nextLine();
            System.out.println("Enter kind of animal: ");
            this.kind = sc.nextLine();
            addPet(name, kind);
        }
        sc.close();
    }
    public void addPet (String name, String kind) {

        switch (kind.toUpperCase().charAt(0)) {
            case 'D': {pets.add(new Dog(name, kind));break;}
            case 'C': {pets.add(new Cat(name, kind));break;}
            case 'P': {pets.add(new Panda(name, kind));break;}
            default:
                System.out.println("Please Keep you imagine pets inside your head");
        }
    }
    public void printPets () {
        for (Pet p: pets
             ) {
            System.out.println(p.kind + " named " + p.name + " says " + p.speak());
        }
    }

}
