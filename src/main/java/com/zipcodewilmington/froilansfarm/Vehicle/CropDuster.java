package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Flyable;

public class CropDuster extends FarmVehicle implements Flyable {

    Integer fertilizerAmount = 8;

    public CropDuster(Integer id, String color) {
        super(id, color);
    }

    public CropDuster() {super();}

    public Boolean hasFertilizer(){
        return fertilizerAmount != 0;
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
    public String makeNoise() {

        return "puh puh puh";
    }
}
