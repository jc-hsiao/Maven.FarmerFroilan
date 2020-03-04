package com.zipcodewilmington.froilansfarm.Simulation;

import org.junit.Assert;
import org.junit.Test;

public class WeekDayTest {
    @Test
    public void getWeekDayNameTest(){
        WeekDay d1 = WeekDay.WED;
        String actual = d1.getWeekDayName();
        String expected = "Wednesday";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWeekDayShortNameTest(){
        WeekDay d1 = WeekDay.FRI;
        String actual = d1.getWeekDayShortName();
        String expected = "Fri";

        Assert.assertEquals(expected, actual);
    }

}
