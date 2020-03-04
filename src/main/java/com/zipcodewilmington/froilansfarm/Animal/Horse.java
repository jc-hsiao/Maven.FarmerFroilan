package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    private int age;
    private String color;
    private String name;
    private boolean isMounted;

    public Horse(String name, String color, int age){
        this.age = age;
        this.color = color;
        this.name = name;
        isMounted = false;
    }

    public Horse(){
        this("","",0);
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
        setHappy(true);;
    }

    public void eat(Edible object) {

    }

    @Override
    public void setMounted(boolean mounted) {
        this.isMounted = mounted;
    }

    @Override
    public boolean isMounted() {
        return isMounted;
    }
}
