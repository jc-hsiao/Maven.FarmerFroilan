package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class CropTest {
    @Test
    public void EarCornTest() {
        Crop corn3 = new CornStalk();
//        Edible actual = corn3.checkIfHarvested();
        corn3.setHarvested(true);
        Assert.assertTrue(corn3.checkIfHarvested());

    }


    @Test
    public void tomatoTest() {
        Crop tomato2 = new TomatoPlant();
        Assert.assertFalse(tomato2.checkIfFertilized());
        tomato2.setFertilized(true);
        Assert.assertTrue(tomato2.checkIfFertilized());
    }
    @Test
    public void IsTomatoFertilizedTest() {
        Crop corn2 = new CornStalk();
        Assert.assertFalse(corn2.checkIfFertilized());
        corn2.setFertilized(true);
        Assert.assertTrue(corn2.checkIfFertilized());
    }


    @Test
    public void IsCornHarvestedTest() {
        Crop corn = new CornStalk();
        Assert.assertFalse(corn.checkIfHarvested());
        corn.setHarvested(true);
        Assert.assertTrue(corn.checkIfHarvested());
    }

    @Test
    public void IsTomatoHarvestedTest() {
        Crop tomato = new TomatoPlant();
        Assert.assertFalse(tomato.checkIfHarvested());
        tomato.setHarvested(true);
        Assert.assertTrue(tomato.checkIfHarvested());
    }

}
