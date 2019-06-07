package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Animals.Cat;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class PetHandlerTest {
    @Test
    public void addPetTest() {
        String expected = "cat";
        PetHandler petHandler = new PetHandler();
        petHandler.addPet("name","cat");
        String actual = petHandler.getPets().get(0).getKind();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void printPetsTest() {
        String expected = "dog named name says Bark Morning!";
        PetHandler petHandler = new PetHandler();
        petHandler.addPet("name","dog");
        String actual = petHandler.printPets();
        Assert.assertEquals(expected,actual);
    }
}
