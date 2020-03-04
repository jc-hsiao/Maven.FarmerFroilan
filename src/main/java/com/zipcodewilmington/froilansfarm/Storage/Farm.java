package com.zipcodewilmington.froilansfarm.Storage;
import java.util.ArrayList;

public class Farm {

    String farmName;
    ArrayList<Stable> stables;
    ArrayList<ChickenCoop> chickenCoops;
    ArrayList<Field> fields;
    FarmHouse farmHouse;
    FoodStorage foodStorage;

    public Farm() {
        this("");
    }
    public Farm(String farmName){
        this.farmName = farmName;
        stables = new ArrayList<Stable>();
        chickenCoops = new ArrayList<ChickenCoop>();
        fields = new ArrayList<Field>();
        farmHouse = null;
        foodStorage = null;
    }
    public Farm(String farmName, ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, ArrayList<Field> fields, FarmHouse farmHouse, FoodStorage foodStorage) {
        this.farmName = farmName;
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.fields = fields;
        this.farmHouse = farmHouse;
        this.foodStorage = foodStorage;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void setStables(ArrayList<Stable> stables) {
        this.stables = stables;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public ArrayList<Field> getFields() {
        return fields;
    }

    public void setFields(ArrayList<Field> fields) {
        this.fields = fields;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public FoodStorage getFoodStorage() {
        return foodStorage;
    }

    public void setFoodStorage(FoodStorage foodStorage) {
        this.foodStorage = foodStorage;
    }

    public void addStable(Stable someStable){
        stables.add(someStable);
    }

    public void addChickenCoop(ChickenCoop someCoop){
        chickenCoops.add(someCoop);
    }

    public void addField(Field someField){
        fields.add(someField);
    }

}
