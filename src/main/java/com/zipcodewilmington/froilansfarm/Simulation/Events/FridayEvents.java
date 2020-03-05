package com.zipcodewilmington.froilansfarm.Simulation.Events;

import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;

public class FridayEvents implements Events {
    public void run(Farm farm) {
        Botanist froilan = (Botanist) farm.getFarmHouse().getPerson("Froilan");
        c.printlnWait("Planting some corn!!")  ;
        Field newField = farm.getFields().get(0);
        CropRow newCropRow = newField.getCropRow(0);
        Crop newCorn = new CornStalk();
        CropRow newRow = new CropRow();
        froilan.plant(newCorn, newRow);
   
    }

}

