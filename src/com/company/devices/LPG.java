package com.company.devices;

import java.time.LocalDate;

public class LPG extends Car{

    public LPG(String producer, String model, int yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Samochód na LPG " + producer + " " + model + " został zatankowany.");
    }
}
