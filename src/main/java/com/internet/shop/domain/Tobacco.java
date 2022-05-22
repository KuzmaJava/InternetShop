package com.internet.shop.domain;

import java.util.Objects;

public class Tobacco {

    private int id;
    private String brand;
    private String flavour;
    private String country;
    private int grams;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tobacco() {
    }

    public Tobacco(int id, String brand, String flavour, String country, int grams) {
        this.id = id;
        this.brand = brand;
        this.flavour = flavour;
        this.country = country;
        this.grams = grams;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }
}
