package com.example.SimpleSpringBoot.beans;

public class Cities {

    private String country;
    private String state;
    private String city;
    private String famous_place;

    public Cities(String country, String state, String city, String famous_place) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.famous_place = famous_place;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFamous_place() {
        return famous_place;
    }

    public void setFamous_place(String famous_place) {
        this.famous_place = famous_place;
    }
}
