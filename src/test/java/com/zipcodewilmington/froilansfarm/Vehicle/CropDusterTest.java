package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import com.zipcodewilmington.froilansfarm.Storage.FieldTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class CropDusterTest {

    private static final Logger LOGGER = Logger.getLogger(CropDusterTest.class.getName());

    @Test
    public void hasFertilizerTest(){

        CropDuster cd = new CropDuster();
        cd.setFertilizerAmount(0);

        LOGGER.info("before " + cd.getFertilizerAmount());

        Assert.assertFalse(cd.hasFertilizer());
        cd.setFertilizerAmount(2);
        Assert.assertTrue(cd.hasFertilizer());

        LOGGER.info("after " + cd.getFertilizerAmount());
    }

    @Test
    public void refillFertilizerTest(){

        CropDuster cd = new CropDuster();
        cd.setFertilizerAmount(2);

        LOGGER.info("before " + cd.getFertilizerAmount());

        cd.refillFertilizer();
        Integer expected = 8;
        Integer actual = cd.getFertilizerAmount();
        Assert.assertEquals(expected,actual);

        LOGGER.info("after " + cd.getFertilizerAmount());
    }

    @Test
    public void fertilizeCropsTest(){
        CropDuster cd = new CropDuster();
        Field newField = new Field();
        cd.fertilizeCrops(newField,2);
        Integer expGas = 7;
        Integer actGas = cd.getGasLevel();
        Integer expFertilizer = 6;
        Integer actFertilizer = cd.getFertilizerAmount();

        Assert.assertEquals(expFertilizer,actFertilizer);
        LOGGER.info("Fertiizer amount is "+actFertilizer);
        Assert.assertEquals(expGas,actGas);
        LOGGER.info("Gas level is " + actGas);
    }



    @Test
    public void flyTest(){

        CropDuster cd = new CropDuster();

        LOGGER.info("before "+cd.getGasLevel());

        cd.fly();
        Integer expected = 9;
        Integer actual = cd.getGasLevel();

        LOGGER.info("after "+actual);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void makeNoiseTest(){

        CropDuster cd = new CropDuster();
        String expected = cd.makeNoise();
        String actual = "puh puh puh";

        LOGGER.info(cd.makeNoise());

        Assert.assertEquals(expected,actual);

    }
}
