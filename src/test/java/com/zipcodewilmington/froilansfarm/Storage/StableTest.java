package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StableTest {

    @Test
    public void constructor1Test(){
        Stable s = new Stable();
        Assert.assertEquals(0, s.getNumOfHorse());
        Assert.assertNull(s.removeHorse("Bullet"));
    }

    @Test
    public void constructor2Test(){
        Stable s;
        ArrayList<Horse> horseArrayL = new ArrayList<>();
        Horse horse1 = new Horse("Bullet", "Black", 2);
        Horse horse2 = new Horse("Epona", "Brown", 3);
        horseArrayL.add(horse1);
        horseArrayL.add(horse2);
        s = new Stable(horseArrayL);

        Assert.assertEquals(2, s.getNumOfHorse());
        Assert.assertEquals( horse1,s.getHorse("Bullet"));
        Assert.assertEquals( horse2,s.getHorse("Epona"));

    }

}
