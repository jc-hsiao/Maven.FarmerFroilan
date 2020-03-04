package com.zipcodewilmington.froilansfarm.Storage;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import java.util.ArrayList;

public class Stable {

    private ArrayList<Horse> horses;

    public Stable(){
        horses = new ArrayList<>();
    }

    public void addHorse(Horse horse){
        horses.add(horse);
    }

    public void removeHorse(String name){
        for( Horse h :horses ){

        }
    }


    public int checkNumOfHorse(){
        return horses.size();
    }


}
