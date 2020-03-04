package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void YieldCornTest() {
        Crop corn3 = new CornStalk();
        Edible expected = corn3.yield();
        Assert.assertTrue (expected instanceof EarOfCorn);
    }
}
