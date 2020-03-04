package com.zipcodewilmington.froilansfarm.Person;

import org.junit.Assert;
import org.junit.Test;

public class BotanistTest {

    @Test

    public void botanistConstructorTest () {
        Botanist botanist = new Botanist("Jim", 57, "Male");
        String expectedName = "Jim";
        String actualName = botanist.getName();
        Integer expectedAge = 57;
        Integer actualAge = botanist.getAge();
        String expectedGender = "Male";
        String actualGender = botanist.getGender();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedGender, actualGender);
    }
}
