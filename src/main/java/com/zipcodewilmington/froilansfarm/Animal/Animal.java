package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;

public abstract class Animal implements Eater {
    private String gender;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }
}
