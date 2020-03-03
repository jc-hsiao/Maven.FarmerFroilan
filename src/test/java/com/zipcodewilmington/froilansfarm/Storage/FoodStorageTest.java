package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FoodStorageTest {
    FoodStorage currentFoodStorage = new FoodStorage();
    LinkedHashMap<String, ArrayList<Edible>> foodStorage;
    ArrayList<Edible> foodToAdd;
    String foodName;
    Edible food;

    @Test
    public void foodStorageConstructorTest() {
        /*foodToAdd = new ArrayList<Edible>();
        foodToAdd.add(null);
        foodToAdd.add(null);
        foodName = "An Ear of Corn";
        foodStorage = new LinkedHashMap<foodName, foodToAdd>();


        Assert.assertEquals(foodName, currentFoodStorage.getFoodKey());*/
    }

}
