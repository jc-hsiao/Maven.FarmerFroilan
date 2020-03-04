package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Produce.Edible;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FoodStorage {
    LinkedHashMap<String, ArrayList<Edible>> foodStorage;

    public FoodStorage() {
        this.foodStorage = new LinkedHashMap<>();
    }

    public void addEdible(String newFood, ArrayList<Edible> food) {
        this.foodStorage.put(newFood, food);
    }

    public void getFoodKey() {
        this.foodStorage.keySet();
    }

    public LinkedHashMap<String, ArrayList<Edible>> getFoodStorage() {
        return foodStorage;
    }

    public void setFoodStorage(LinkedHashMap<String, ArrayList<Edible>> foodStorage) {
        this.foodStorage = foodStorage;
    }
}
