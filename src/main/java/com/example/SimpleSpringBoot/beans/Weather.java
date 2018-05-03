package com.example.SimpleSpringBoot.beans;

public class Weather {

    private Object temp;
    private Object temp_min;
    private Object temp_max;
    private String city_name;
    private String country;
    private String famous_place;

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFamous_place() {
        return famous_place;
    }

    public void setFamous_place(String famous_place) {
        this.famous_place = famous_place;
    }

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
