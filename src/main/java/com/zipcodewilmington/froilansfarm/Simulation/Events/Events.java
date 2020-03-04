package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Console;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Storage.Farm;

public interface Events {

    public static Console c = new Console(System.out);
    void run(Farm farm);

    static void everyMorning( Farm farm ){
        //thing that will happen every morning
        c.printlnWait("The early birds are chirping.");
    }


    static void everyNight( Farm farm ){
        //thing that will happen every night
        Person mc = farm.getFarmHouse().getPerson("Froilan");
        c.printlnWait( "The moon is out! "+mc.getName()+" shouts to the sky: DO YOUR UNIT TESTS!!!!");
    }


}
