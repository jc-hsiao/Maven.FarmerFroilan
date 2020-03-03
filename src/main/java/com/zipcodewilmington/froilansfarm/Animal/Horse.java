package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    private int age;
    private String color;
    private String name;

    public Horse(int age, String color, String name){
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public Horse(){
        this.age = 0;
        this.color = "";
        this.name = "";
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void gallop(){

    }
}
