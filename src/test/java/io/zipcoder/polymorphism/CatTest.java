package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Animals.Cat;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class CatTest {


    @Test
    public void catSpeakTest() {
        Pet cat = new Cat("","cat");
        String expected = "Bonjour";
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }
}
