package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Produce.Egg;

public class Chicken extends Animal implements Produce {
    public void eat(Edible object) {

    }

    public void yield(Produce crop) {

    }

    public Egg layEgg(){
        return new Egg();
    }

    @Override
    public Edible yield() {
        return new Egg();
    }
}
