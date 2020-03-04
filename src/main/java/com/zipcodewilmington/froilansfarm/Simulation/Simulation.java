package com.zipcodewilmington.froilansfarm.Simulation;
import com.zipcodewilmington.froilansfarm.Console;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Simulation.Events.Events;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.FarmHouse;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulation {

    public static Console c = new Console(System.out);

    public static Farm setUpScenario(){
        //create all the people/animal/plants/buildings here
        //will return a Farm that is stuffed with everything we need for simulation.

        Farm mainFarm = new Farm("Froilan's Farm");
        FarmHouse froilansHouse = new FarmHouse();
        Person froilan = new Farmer("Froilan",25,"Male");
        froilansHouse.addPerson(froilan);
        mainFarm.setFarmHouse(froilansHouse);

        return mainFarm;
    }

    public static void simulate(Farm someFarm){
        c.printlnWaitWithTime(2000L, "The simulation for the week is starting.");

        for (WeekDay d :WeekDay.values()) {
            c.printlnWait(" [ It's "+d.getWeekDayName()+"! ] ");
            Events.everyMorning(someFarm);
            d.getWeekDayEvents().run(someFarm);
            Events.everyNight(someFarm);
        }

        c.printlnWaitWithTime(2000L, "The simulation for the week has ended.");
    }


}
