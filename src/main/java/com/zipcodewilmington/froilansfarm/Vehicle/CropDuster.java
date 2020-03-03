package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Flyable;

public class CropDuster extends FarmVehicle implements Flyable {

    public CropDuster(Integer id, String color) {
        super(id, color);
    }

    public CropDuster() {
    }

    public Boolean hasFertilizer(){

        return false;
    }

    public void fertilizeCrops(){


    }



    @Override
    public void fly() {}

    @Override
    public void makeNoise() {

    }
}
