package com.company.devices;

public abstract class Device {
    public final int yearOfProduction;
    final String producer;
    final String model;
    public Double value;


    public Device(String producer, String model, int yearOfProduction, Double value) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }
    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
    abstract public void turnOn();
}
