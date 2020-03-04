package com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;

public class TomatoPlant extends Crop {

    ArrayList<Tomato> tomatoPlantWithFruit;

    public TomatoPlant() {
        this.tomatoPlantWithFruit = new ArrayList<>();
    }

    public void removeFruit(Tomato newTomato) {
        tomatoPlantWithFruit.remove(newTomato);
    }

    public void addFruit(Tomato newTomato) {
        tomatoPlantWithFruit.add(newTomato);
    }

    @Override
    public Edible yield() {
        return new Tomato();
    }
}


