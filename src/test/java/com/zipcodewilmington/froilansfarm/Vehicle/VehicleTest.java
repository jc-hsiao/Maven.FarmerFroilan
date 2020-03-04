package com.zipcodewilmington.froilansfarm.Vehicle;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class VehicleTest {
    private static final Logger LOGGER = Logger.getLogger(VehicleTest.class.getName());

    @Test
    public void idTest(){

        Tractor tractor = new Tractor();
        tractor.setId(10);

        LOGGER.info(""+ tractor.getId());

        Integer expected = tractor.getId();
        Integer actual = 10;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void refillTest(){

        FarmVehicle newVehicle = new Tractor();
        newVehicle.setGasLevel(3);
        newVehicle.refill();
        Integer expected = 10;
        Integer actual =  newVehicle.getGasLevel();
        Assert.assertEquals(expected,actual);

        LOGGER.info("" + actual);

    }

}
