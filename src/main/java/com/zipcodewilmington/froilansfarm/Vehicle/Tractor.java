package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Field;

import java.util.ArrayList;

public class Tractor extends FarmVehicle {

    public Tractor(Integer id, String color) {
        super(id, color);
    }

    public Tractor() {
    }

    public ArrayList<Crop> harvestCrops(CropRow newRow, Integer amtOfCrops){
        ArrayList<Crop> harvestedCrops = new ArrayList<>();

        for(int i = 0; i < amtOfCrops; i++){

        }
        return harvestedCrops;

    }

    @Override
    public String makeNoise() {
        return "Vroom Vroom";

    }
}
