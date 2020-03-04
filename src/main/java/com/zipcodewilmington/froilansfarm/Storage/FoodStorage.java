package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Produce.StrangeFruit;
import com.zipcodewilmington.froilansfarm.Produce.Edible;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FoodStorage {
    LinkedHashMap<String, ArrayList<Edible>> foodStorage;
    ArrayList<Edible> foodToBeAdded = new ArrayList<>();
    Object[] listOfProduceToEat = {"corn", "tomato", "strange fruit"};

    public FoodStorage() {
        this.foodStorage = new LinkedHashMap<>();
    }

    public void addFoodSet(String newFood, ArrayList<Edible> food) {
        this.foodStorage.put(newFood, food);
    }

    public LinkedHashMap<String, ArrayList<Edible>> getFoodStorage() {
        return foodStorage;
    }

    public void updateFoodCount(String foodName, Produce newProduce, int howMany) {
        if (foodStorage.containsKey(foodName)) {
            for (int i = 0; i < howMany; i++) {
                Edible produce = new StrangeFruit();
                foodToBeAdded.add(produce);
                foodStorage.put(foodName, foodToBeAdded);
            }
        }
    }
}