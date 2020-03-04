package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void YieldCornTest() {
        Crop corn3 = new CornStalk();
        Edible actual = new EarOfCorn();

        Edible expected = corn3.yield();
        Assert.assertEquals(actual, expected);
    }
}
