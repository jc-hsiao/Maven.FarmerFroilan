package com.zipcodewilmington.froilansfarm.Vehicle;

public abstract class FarmVehicle extends Vehicle{

    private String color;
    private Integer gasLevel;


    public FarmVehicle() {
    }

    public FarmVehicle(Integer id, String color) {
        super(id);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(Integer gasLevel) {
        this.gasLevel = gasLevel;
    }

    public Boolean isEmpty (Integer gasLevel){
        if(gasLevel == 0){
            return true;
        }
        return false;
    }

}
