package com.company.devices;

import java.time.LocalDate;

public class Electric extends Car{

    public Electric(String producer, String model, int yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Samochód elektryczny " + producer + " " + model + " zostało naładowane.");
    }
}