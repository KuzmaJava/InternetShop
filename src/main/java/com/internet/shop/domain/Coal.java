package com.internet.shop.domain;

import java.util.Objects;

public class Coal {

    private int id;
    private String brand;
    private double cubeSize;
    private String country;
    private double price;

    public Coal() {
    }

    public Coal(int id, String brand, double cubeSize, String country, double price) {
        this.id = id;
        this.brand = brand;
        this.cubeSize = cubeSize;
        this.country = country;
        this.price = price;
    }

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

    public double getCubeSize() {
        return cubeSize;
    }

    public void setCubeSize(double cubeSize) {
        this.cubeSize = cubeSize;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
