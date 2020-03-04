package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class TuesdayEvents implements Events {

    public void run(Farm farm) {
        //things happens ONLY on Tuesday will start here
        //c.printlnWait("Tragic happened on Tuesday...");
        farm.getFarmHouse().getPerson("Froilan");
        Field field = farm.getFields().get(0);
        CropRow newCropRow = field.getCropRow(0);
        Tractor tractor = (Tractor) farm.getVehicles().get(0);
        tractor.harvestCrops(newCropRow);


    }
}
