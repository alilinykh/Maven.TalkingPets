package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Animals.Cat;
import io.zipcoder.polymorphism.Animals.Dog;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class DogTest {


    @Test
    public void dogSpeakTest() {
        Pet dog = new Dog("doggo", "dog");
        String expected = "Bark Morning!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}