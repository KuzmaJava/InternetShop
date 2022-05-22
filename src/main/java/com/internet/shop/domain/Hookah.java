package com.internet.shop.domain;

public class Hookah {

    private int id;
    private String brand;
    private String country;
    private double height;
    private double flaskVolume;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFlaskVolume() {
        return flaskVolume;
    }

    public void setFlaskVolume(double flaskVolume) {
        this.flaskVolume = flaskVolume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Hookah() {
    }

    public Hookah(int id, String brand, String country, double height, double flaskVolume, double price) {
        this.id = id;
        this.brand = brand;
        this.country = country;
        this.height = height;
        this.flaskVolume = flaskVolume;
        this.price = price;
    }
}
