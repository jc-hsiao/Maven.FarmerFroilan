package com.zipcodewilmington.froilansfarm.Vehicle;

public abstract class FarmVehicle extends Vehicle{

    private String color;



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



    public Boolean isEmpty (Integer gasLevel){
        if(gasLevel == 0){
            return true;
        }
        return false;
    }

    public void refill(){
        setGasLevel(10);
    }

}
