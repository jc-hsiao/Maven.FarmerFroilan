package com.zipcodewilmington.froilansfarm.Simulation;

import com.zipcodewilmington.froilansfarm.Simulation.Events.Events;
import com.zipcodewilmington.froilansfarm.Simulation.Events.MondayEvents;
import com.zipcodewilmington.froilansfarm.Simulation.Events.SundayEvents;
import com.zipcodewilmington.froilansfarm.Simulation.Events.TuesdayEvents;

public enum WeekDay {

    MON("Monday","Mon", new MondayEvents()),
    TUE("Tuesday","Tue", new TuesdayEvents()),
    WED("Wednesday","Wed", new SundayEvents()),
    THU("Thursday","Thr", new SundayEvents()),
    FRI("Friday","Fri", new SundayEvents()),
    SAT("Saturday","Sat", new SundayEvents()),
    SUN("Sunday","Sun", new SundayEvents());

    private String weekDayName;
    private String weekDayShortName;
    private Events weekDayEvents;

    private WeekDay(String weekDayName, String weekDayShortName, Events weekDayEvents){
        this.weekDayName = weekDayName;
        this.weekDayShortName = weekDayShortName;
        this.weekDayEvents = weekDayEvents;
    }

    public String getWeekDayName() {
        return weekDayName;
    }

    public String getWeekDayShortName() {
        return weekDayShortName;
    }

    public Events getWeekDayEvents() { return weekDayEvents; }
}
