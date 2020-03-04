package com.zipcodewilmington.froilansfarm.Produce;

public class CornStalk extends Crop {

    @Override
    public Edible yield() {
        return new EarOfCorn();
    }


}
