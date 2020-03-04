package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class TomatoPlant extends Crop {

    @Override
    public Edible yield() {
        return new Tomato();
    }
}
