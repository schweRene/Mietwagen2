package com.example.mietwagen;

import javafx.collections.ObservableList;

public class User {


    private Integer baujahr;
    private Double preis;
    private String hersteller;
    private String kraftstoffart;
    private Integer id;

    private Integer kilometerstand;

    public User(Integer baujahr, Double preis, String hersteller, String kraftstoffart, Integer id, Integer kilometerstand) {
        this.baujahr = baujahr;
        this.preis = preis;
        this.hersteller = hersteller;
        this.kraftstoffart = kraftstoffart;
        this.id = id;
        this.kilometerstand = kilometerstand;
    }

    public Integer getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(Integer baujahr) {
        this.baujahr = baujahr;
    }

    public Double getPreis() {
        return preis;
    }

    public void setPreis(Double preis) {
        this.preis = preis;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getKraftstoffart() {
        return kraftstoffart;
    }

    public void setKraftstoffart(String kraftstoffart) {
        this.kraftstoffart = kraftstoffart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(Integer kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public void setItems(ObservableList<User> currentTableData) {
    }


}
