package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    private Integer numPets;
    private ArrayList<Pet> pets;
    private String name;
    private String kind;




    public static void main(String[] args) {
        MainApplication m = new MainApplication();
        m.getNumPets();

    }

    public Integer getNumPets () {

        System.out.println("Please enter num of pets");
        Scanner sc = new Scanner(System.in);
        numPets = sc.nextInt();
        sc.close();
        return numPets;
    }

    public void addPet() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter information about each pet you have");
        for (int i = 0; i < numPets; i++) {
            System.out.println("Enter pet's name: ");
            this.name = sc.nextLine();
            System.out.println("Enter kind of animal: ");
            this.kind = sc.nextLine();
            pets.add(new Pet(name, kind));
        }
        sc.close();
    }
}
