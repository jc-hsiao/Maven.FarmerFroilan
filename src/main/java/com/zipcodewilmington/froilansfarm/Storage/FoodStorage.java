package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FoodStorage {
    LinkedHashMap<String, ArrayList<Edible>> foodStorage;

    public FoodStorage(LinkedHashMap<String, ArrayList<Edible>> foodStorage) {
        this.foodStorage = foodStorage;
    }

    public FoodStorage() {
        this.foodStorage = null;
    }

    public void addEdible(String newFood, ArrayList<Edible> food) {
        this.foodStorage.put(newFood, food);
    }

    public void getFoodKey() {
        this.foodStorage.keySet();
    }

    public void getFoodValue() {

    }

    public LinkedHashMap<String, ArrayList<Edible>> getFoodStorage() {
        return foodStorage;
    }

    public void setFoodStorage(LinkedHashMap<String, ArrayList<Edible>> foodStorage) {
        this.foodStorage = foodStorage;
    }
}
