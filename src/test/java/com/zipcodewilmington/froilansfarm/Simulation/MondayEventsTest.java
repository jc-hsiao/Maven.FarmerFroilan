package com.zipcodewilmington.froilansfarm.Simulation;

import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Simulation.Events.MondayEvents;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class MondayEventsTest {

    private static final Logger LOGGER = Logger.getLogger(MondayEventsTest.class.getName());


    Farm farm = Simulation.setUpScenario();
    MondayEvents monday = new MondayEvents();

    @Test
    public void checkCreationOfFroilanda() {
        Person newPerson = monday.createFroilanda(farm);
        farm.getFarmHouse().addPerson(newPerson);
        Person person = farm.getFarmHouse().getListOfPeople().get(1);

        String expectedName = "Froilanda";
        String actualName = farm.getFarmHouse().getListOfPeople().get(1).getName();

        Assert.assertEquals(expectedName, actualName);
    }
}
