package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class EggTest {
    @Test
    public void eggConstructTest(){
        Egg egg1 = new Egg();
        Assert.assertEquals("eggy",egg1.getFlavor());
        Assert.assertEquals(0.3,egg1.getQuality(),0.01);
        Assert.assertFalse(egg1.isFertile());
    }
}
