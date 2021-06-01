package com.company.devices;

public class Disel extends Car{

    public Disel(String producer, String model, int yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Samochód disel " + producer + " " + model + " zotał zatankowany.");
    }
}
