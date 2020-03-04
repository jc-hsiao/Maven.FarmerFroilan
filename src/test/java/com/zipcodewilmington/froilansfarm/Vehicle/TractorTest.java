package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

import java.util.logging.Logger;

public class TractorTest {

    private static final Logger LOGGER = Logger.getLogger(TractorTest.class.getName());


    @Test
    public void harvestCropTest(){

        Tractor newTractor = new Tractor();
        CropRow newRow = new CropRow();


    }



    @Test
    public void makeNoiseTest() {

        Tractor tractor = new Tractor();
        String expected = tractor.makeNoise();
        String actual = "Vroom Vroom";
        Assert.assertEquals(expected,actual);

        LOGGER.info(tractor.makeNoise());
    }
}
