package com.internet.shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "hookah")
public class Hookah {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private double height;
    private String country;
    @Column(name = "flask_volume")
    private double flaskVolume;
    private double price;

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

    public Hookah(Long id, String brand, String country, double height, double flaskVolume, double price) {
        this.id = id;
        this.brand = brand;
        this.country = country;
        this.height = height;
        this.flaskVolume = flaskVolume;
        this.price = price;
    }
}
