package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Produce.StrangeFruit;
import com.zipcodewilmington.froilansfarm.Produce.StrangePlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FoodStorageTest {

    FoodStorage currentFoodStorage = new FoodStorage();
    //LinkedHashMap<String, ArrayList<Edible>> foodStorage;
    ArrayList<Edible> listOfFood = new ArrayList<>();
    ArrayList<Edible> listOfPurpleFruit = new ArrayList<>();
    Produce strangePlant = new StrangePlant();
    Produce anotherStrangePlant = new StrangePlant();
    Edible currentStrangeFruit = new StrangeFruit();
    Edible anotherStrangeFruit = new StrangeFruit();
    String foodName = "StrangePlant";
    String purpleFruit = "purpleFruit";

    @Test
    public void foodStorageConstructorTest() {
        listOfFood.add(currentStrangeFruit);
        currentFoodStorage = new FoodStorage();
        currentFoodStorage.addFoodSet(foodName, listOfFood);
        Integer currentFoodStorageSize = currentFoodStorage.foodStorage.keySet().size();
        Integer expectedFoodStorageSize = 1;

        Assert.assertEquals(expectedFoodStorageSize, currentFoodStorageSize);
    }

    @Test
    public void addNewFoodTest() {
        listOfFood.add(anotherStrangeFruit);
        currentFoodStorage.addFoodSet(foodName, listOfFood);
        Integer currentFoodStorageSize = currentFoodStorage.foodStorage.keySet().size();
        Integer expectedFoodStorageSize = 1;

        Assert.assertEquals(expectedFoodStorageSize, currentFoodStorageSize);
    }

    @Test
    public void updateFoodCount() {
        listOfFood.add(currentStrangeFruit);
        currentFoodStorage.addFoodSet(foodName, listOfFood);
        currentFoodStorage.updateFoodCount(foodName, anotherStrangePlant, 10);
        /*Integer a = currentFoodStorage.getFoodStorage().containsKey(foodName);
        Integer g = 1;*/
        Integer a = currentFoodStorage.getFoodStorage().get(foodName).size();
        System.out.println(a);
        Assert.assertTrue(currentFoodStorage.getFoodStorage().containsKey(foodName));
        //Assert.assertEquals(a, g);
    }

}
