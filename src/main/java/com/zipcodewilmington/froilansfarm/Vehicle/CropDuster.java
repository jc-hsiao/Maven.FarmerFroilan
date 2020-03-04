package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Flyable;
import com.zipcodewilmington.froilansfarm.Storage.Field;

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

    public void fertilizeCrops(Field newField, Integer amtOfRows) throws Exception {

        fly();
        newField.getCropRow(amtOfRows);

        for (int i = 0; i <amtOfRows  ; i++) {
            setGasLevel(getGasLevel() - 1);
            setFertilizerAmount(getFertilizerAmount() - 1);

        }
    }

    public Integer getFertilizerAmount() throws Exception {

        if(fertilizerAmount < 0) {
            throw new Exception("Out of fertilizer"); }
        else {
            return fertilizerAmount;
        }
    }

    public void setFertilizerAmount(Integer fertilizer) {
        this.fertilizerAmount = fertilizer;
    }

    public void refillFertilizer(){
    setFertilizerAmount(8);

    }

    @Override
    public void fly() throws Exception {

        setGasLevel(getGasLevel()-1);
    }

    @Override
    public String makeNoise() {

        return "puh puh puh";
    }
}
