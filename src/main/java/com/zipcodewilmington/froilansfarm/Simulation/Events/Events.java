package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Console;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.Egg;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.FoodStorage;
import com.zipcodewilmington.froilansfarm.Storage.Stable;

import java.util.ArrayList;

public interface Events {

    Console c = new Console(System.out);
    void run(Farm farm);

    static Farmer getMC(Farm farm){
        return (Farmer)farm.getFarmHouse().getPerson("Froilan");
    }

    static Botanist getMC2(Farm farm){
        return (Botanist)farm.getFarmHouse().getPerson("Foilanda");
    }

    static void everyMorning( Farm farm ){
        //thing that will happen every morning
        c.printlnWait("The early birds are chirping.");

        mcEats(getMC2(farm), 2, 1, 2, farm.getFoodStorage());
        mcEats(getMC(farm), 1, 2, 5, farm.getFoodStorage());

        ArrayList<Stable> stables = farm.getStables();
        for(Stable s : stables){
            for(Horse h : s.getHorses()){
                getMC(farm).tame(h);
                c.printlnWait(getMC(farm).getName()+ " is taming "+ h.getName()+", it's docile: "+ h.isDocile());
                getMC(farm).mount(h);
                c.printlnWait(getMC(farm).getName()+ " mounts on "+ h.getName());
                h.gallop();
                getMC(farm).dismount(h);
                c.printlnWait(getMC(farm).getName()+ " dismounts "+ h.getName());
                h.eat(new EarOfCorn(), farm.getAnimalFoodStorage());
                h.eat(new EarOfCorn(), farm.getAnimalFoodStorage());
                h.eat(new EarOfCorn(), farm.getAnimalFoodStorage());
                int num = farm.getAnimalFoodStorage().getFoodCount("EarOfCorn");
                c.printlnWait(getMC(farm).getName()+" feed "+ h.getName()+" 3 corn. There are "+ num+" corn left in the silo");
            }
        }


    }

    static void mcEats(Person p, int numOfCorn, int numOfTom, int numOfEgg, FoodStorage fridge){
        for(int i=0; i<numOfCorn; i++)
            p.eat(new EarOfCorn(), fridge);
        for(int i=0; i<numOfTom; i++)
            p.eat(new Tomato(), fridge);
        for(int i=0; i<numOfEgg; i++)
            p.eat(new Egg(), fridge);

        c.printlnWait(p.getName()+" eat her breakfast, now the storage have "+
                fridge.getFoodCount("EarOfCorn") + " more corns, "+
                fridge.getFoodCount("Tomato") +" more tomatoes, and "+
                fridge.getFoodCount("Egg") +" more eggs");

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
