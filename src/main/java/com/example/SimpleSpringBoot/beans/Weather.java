package com.example.SimpleSpringBoot.beans;

public class Weather {

    private Object temp;
    private Object temp_min;
    private Object temp_max;


    public Object getTemp() {
        return temp;
    }

    public void setTemp(Object temp) {
        this.temp = temp;
    }

    public Object getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(Object temp_min) {
        this.temp_min = temp_min;
    }

    public Object getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(Object temp_max) {
        this.temp_max = temp_max;
    }
}
