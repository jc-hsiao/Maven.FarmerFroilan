package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Person.Person;

import java.util.ArrayList;

public class FarmHouse {

    ArrayList<Person> listOfPeople;

    public FarmHouse() {
        this.listOfPeople = new ArrayList<>();
    }

    public void addPerson(Person newPerson) {
        listOfPeople.add(newPerson);
    }

    public ArrayList<Person> getListOfPeople() {
        return listOfPeople;
    }

}
