package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {
    @Test
    public void edibleConstructorTest1(){
        Edible food = new Egg();
        Assert.assertEquals("",food.getFlavor());
        Assert.assertEquals(0.3,food.getQuality(),0.01);
    }

    @Test
    public void edibleConstructorTest2(){
        Edible food = new Egg();
        Assert.assertEquals("",food.getFlavor());
        Assert.assertEquals(0.3,food.getQuality(),0.01);
    }
}
