package com.zipcodewilmington.froilansfarm.Utils;

public enum WeekDay {

    MON("Monday","Mon"),
    TUE("Tuesday","Tue"),
    WED("Wednesday","Wed"),
    THU("Thursday","Thr"),
    FRI("Friday","Fri"),
    SAT("Saturday","Sat"),
    SUN("SunDay","Sun");

    private String weekDayName;
    private String weekDayShortName;

    private WeekDay(String weekDayName, String weekDayShortName){
        this.weekDayName = weekDayName;
        this.weekDayShortName = weekDayShortName;
    }

    public String getWeekDayName() {
        return weekDayName;
    }

    public String getWeekDayShortName() {
        return weekDayShortName;
    }


}
