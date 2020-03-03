package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void testGender(){
        //given
        Chicken mickey = new Chicken();
        //when
        mickey.setGender("male");
        String expected = "male";
        String actual = mickey.getGender();
        //then
        Assert.assertEquals(expected, actual);

    }
}
