package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Console;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Stable;

import java.util.ArrayList;

public interface Events {

    Console c = new Console(System.out);
    void run(Farm farm);

    static Farmer getMC(Farm farm){
        return (Farmer)farm.getFarmHouse().getPerson("Froilan");
    }

    static void everyMorning( Farm farm ){
        //thing that will happen every morning
        c.printlnWait("The early birds are chirping.");
        ArrayList<Stable> stables = farm.getStables();
        for(Stable s1:stables){
            //c.printlnWait();
        }



    }


    static void everyNight( Farm farm ){
        //thing that will happen every night

        Person mc = getMC(farm);
        c.printlnWait("The moon is out! "+mc.getName()+" shouts to the sky: DO YOUR UNIT TESTS!!!!");
        c.printlnWait("The mountain echos: UNIT TEST.....");
        c.printlnWait("Unit test.......");
        c.printlnWait("it test......");
        c.printlnWait("test.....");
    }


}
