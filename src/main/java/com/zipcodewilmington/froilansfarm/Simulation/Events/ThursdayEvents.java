package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Storage.Farm;

public class ThursdayEvents implements Events{
    public void run(Farm farm){

        Farmer fro = (Farmer) farm.getFarmHouse().getPerson("Froilan");
        c.printlnWait(fro.getName()+" feel a little hungry.");
        fro.eat(new Tomato(), farm.getFoodStorage());
        c.printlnWait(fro.getName()+" eats a tomato from the fridge.");

    }

}
