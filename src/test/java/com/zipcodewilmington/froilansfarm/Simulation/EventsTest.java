package com.zipcodewilmington.froilansfarm.Simulation;

import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.froilansfarm.Simulation.Events.Events.getMC;
import static com.zipcodewilmington.froilansfarm.Simulation.Events.Events.getMC2;

public class EventsTest {

    Farm farm = Simulation.setUpScenario();

    @Test
    public void getMC1Test(){
        Farmer mc = getMC(farm);
        Assert.assertEquals("Froilan",mc.getName());
        Assert.assertEquals(25,mc.getAge());
        Assert.assertEquals("Male",mc.getGender());
    }

    @Test
    public void getMC2Test(){
        Botanist mc = getMC2(farm);
        Assert.assertEquals("Foilanda",mc.getName());
        Assert.assertEquals(22,mc.getAge());
        Assert.assertEquals("Female",mc.getGender());
    }


}
