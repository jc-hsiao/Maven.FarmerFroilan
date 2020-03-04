package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Console;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Storage.Farm;

public interface Events {

    Console c = new Console(System.out);
    void run(Farm farm);

    static Person getMC(Farm farm){
        return farm.getFarmHouse().getPerson("Froilan");
    }

    static void everyMorning( Farm farm ){
        //thing that will happen every morning
        c.printlnWait("The early birds are chirping.");
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
