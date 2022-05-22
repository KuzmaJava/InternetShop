package com.internet.shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "coal")
public class Coal {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String brand;
    @Column(name = "cube_size")
    private double cubeSize;
    private String country;
    private double price;

    public Coal() {
    }

    public Coal(Long id, String brand, double cubeSize, String country, double price) {
        this.id = id;
        this.brand = brand;
        this.cubeSize = cubeSize;
        this.country = country;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
