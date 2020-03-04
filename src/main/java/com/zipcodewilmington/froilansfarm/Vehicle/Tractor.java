package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Produce.Crop;

public class Tractor extends FarmVehicle {

    public Tractor(Integer id, String color) {
        super(id, color);
    }

    public Tractor() {
    }

    public Crop harvestCrops(){

        return null;

    }

    @Override
    public String makeNoise() {
        return "Vroom Vroom";

    }
}
