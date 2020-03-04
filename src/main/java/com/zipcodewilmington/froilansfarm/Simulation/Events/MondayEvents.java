package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Storage.Farm;

public class MondayEvents implements Events{
    public void run(Farm farm){
        Person froilanda = (Botanist)farm.getFarmHouse().getPerson("Froilanda");
        //things happens ONLY on Monday will start here
        c.printlnWait(froilanda.getName() + " gets into the Crop Duster.");
        

    }

}
