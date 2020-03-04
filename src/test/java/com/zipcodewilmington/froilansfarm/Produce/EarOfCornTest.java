package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class EarOfCornTest {

    @Test
    public void cornConstructTest(){
        Edible someFood = new EarOfCorn();
        Assert.assertEquals("sweet",someFood.getFlavor());
        Assert.assertEquals(0.3,someFood.getQuality(),0.01);
    }
}
