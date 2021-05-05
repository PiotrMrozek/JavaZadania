package com.company.devices;

public class Car extends Device {
    public final int id;

    public String color;
    public Double mileage;
    public Double engineVolume;
    public Double value;
    public int horsepower;

    public Car(String producer, String model, int yearOfProduction, int id) {
        super(producer, model, yearOfProduction);
        this.id = id;

    }
    public String toString() {
        return id+" "+producer+" "+model+" "+yearOfProduction+" "+mileage+ " " + horsepower+" "+color+" "+ engineVolume+" "+value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return id == car.id &&
                model.equals(car.model) && mileage.equals(car.mileage) && horsepower == car.horsepower && color.equals(car.color) && engineVolume.equals(car.engineVolume) &&
                value.equals(car.value) &&
                producer.equals(car.producer);
    }

    @Override
    public int hashCode() {
        return id;
    }

}
