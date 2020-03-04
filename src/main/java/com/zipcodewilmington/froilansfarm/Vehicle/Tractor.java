package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Field;

import java.util.ArrayList;
import java.util.Collections;

public class Tractor extends FarmVehicle {

    public Tractor(Integer id, String color) {
        super(id, color);
    }

    public Tractor() {
    }

    public ArrayList<Crop> harvestCrops(CropRow newRow){
        ArrayList<Crop> harvestedCrops = new ArrayList<>();

        for(Crop c : newRow.getCrops()){
            harvestedCrops.add(c);
            setGasLevel(getGasLevel()-1);
        }

        return harvestedCrops;
    }

    @Override
    public String makeNoise() {
        return "Vroom Vroom";

    }
}
