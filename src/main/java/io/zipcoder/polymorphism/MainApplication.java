package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        PetHandler petHandler = new PetHandler();
        petHandler.getPetInfo(petHandler.getNumPets());
        System.out.println(petHandler.printPets());
    }
}
