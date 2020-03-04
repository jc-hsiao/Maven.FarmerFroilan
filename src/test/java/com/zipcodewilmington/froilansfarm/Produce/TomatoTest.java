package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {
    @Test
    public void tomatoConstructTest(){
        Edible someFood = new Tomato();
        Assert.assertEquals("sour and juicy",someFood.getFlavor());
        Assert.assertEquals(0.3,someFood.getQuality(),0.01);
    }
}
