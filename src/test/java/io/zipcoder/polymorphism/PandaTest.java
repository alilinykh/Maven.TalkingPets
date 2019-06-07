package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Animals.Cat;
import io.zipcoder.polymorphism.Animals.Panda;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class PandaTest {


    @Test
    public void pandaSpeakTest() {
        Pet panda = new Panda("pando", "panda");
        String expected = "I love bamboo";
        String actual = panda.speak();
        Assert.assertEquals(expected, actual);
    }
}