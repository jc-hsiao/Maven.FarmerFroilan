package com.zipcodewilmington.froilansfarm.Vehicle;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class FarmVehicleTest {
    private static final Logger LOGGER = Logger.getLogger(FarmVehicleTest.class.getName());

    @Test
    public void isEmptyTest() {

        FarmVehicle newFarmVehicle = new CropDuster();
        newFarmVehicle.setGasLevel(5);
        Integer gasLevel = newFarmVehicle.getGasLevel();
        Assert.assertTrue(newFarmVehicle.isEmpty(0));
        Assert.assertFalse(newFarmVehicle.isEmpty(5));

        LOGGER.info("" + gasLevel);
    }

    @Test
    public void colorTest() {
        FarmVehicle newFarmVehicle = new Tractor();
        newFarmVehicle.setColor("Red");
        String actual = newFarmVehicle.getColor();
        String expected = "Red";

        Assert.assertEquals(expected, actual);

        LOGGER.info(actual);

    }

    @Test
    public void checkGasFieldTest() {

        FarmVehicle newVehicle = new Tractor();
        Integer actual = newVehicle.getGasLevel();
        Integer expected = 10;
        Assert.assertEquals(expected, actual);

        LOGGER.info("" + actual);
    }
}


