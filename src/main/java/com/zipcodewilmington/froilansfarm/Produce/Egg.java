package com.zipcodewilmington.froilansfarm.Produce;

public class Egg extends Edible {

    private boolean isFertile;

    public Egg() {
        this(0.3);
    }

    public Egg(double quality){
        super(quality, "eggy");
        isFertile = false;
    }

    public boolean isFertile() {
        return isFertile;
    }
}
