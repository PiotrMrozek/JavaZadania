package com.company.devices;

public abstract class Device {
    final int yearOfProduction;
    final String producer;
    final String model;


    public Device(String producer, String model, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }
    public void turnOn() {
        System.out.println("Urządzenie " + producer + " " + model + " włącza się.");
    }
}
