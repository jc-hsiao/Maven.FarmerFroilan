package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Flyable;

import java.util.logging.Logger;


public class CropDuster extends FarmVehicle implements Flyable {
    private static final Logger LOGGER = Logger.getLogger(CropDuster.class.getName());

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
    public void fly() {

        setGasLevel(getGasLevel()-1);
    }

    @Override
    public String makeNoise() {

        return "puh puh puh";
    }
}
