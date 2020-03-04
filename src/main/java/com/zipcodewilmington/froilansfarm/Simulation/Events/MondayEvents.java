package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public class MondayEvents implements Events{
    public void run(Farm farm) {
        Person froilanda = (Botanist)farm.getFarmHouse().getPerson("Froilanda");
        //things happens ONLY on Monday will start here
        c.printlnWait(froilanda.getName() + " gets into the Crop Duster.");
        FarmVehicle cropDuster = farm.getVehicles().get(1);
        CropDuster temp = (CropDuster)cropDuster;
        temp.fertilizeCrops(farm.getFields().get(0), 1);
    }

}
