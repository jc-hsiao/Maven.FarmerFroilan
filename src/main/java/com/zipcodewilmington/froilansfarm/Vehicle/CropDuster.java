package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Flyable;
import com.zipcodewilmington.froilansfarm.Produce.Crop;

public class CropDuster extends FarmVehicle implements Flyable {

    Integer fertilizerAmount = 8;

    public CropDuster(Integer id, String color) {
        super(id, color);
    }

    public CropDuster() {

    }

    public Boolean hasFertilizer(){

        if(fertilizerAmount == 0){
            return false;
        }
        return true;
    }

    public void fertilizeCrops(){


    }

    public Integer getFertilizerAmount() {
        return fertilizerAmount;
    }

    public void setFertilizerAmount(Integer fertilizer) {
        this.fertilizerAmount = fertilizer;
    }

    public void refillFertilizer(){
    setFertilizerAmount(8);

    }



    @Override
    public void fly() {}

    @Override
    public void makeNoise() {

    }
}
