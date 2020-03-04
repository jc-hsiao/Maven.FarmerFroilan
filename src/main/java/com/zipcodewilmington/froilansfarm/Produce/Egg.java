package com.zipcodewilmington.froilansfarm.Produce;

public class Egg extends Edible {

    boolean isFertile;

    public Egg() {
        super(0.3, "eggy");
        isFertile = false;
    }

    public boolean isFertile() {
        return isFertile;
    }
}
