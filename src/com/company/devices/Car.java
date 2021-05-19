package com.company.devices;


    import com.company.Human;
    import com.company.salleable;
    public class Car extends Device implements salleable {

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
    public void turnOn() {
        System.out.println("Samochód:" + producer + " " + model + "został odpalony");
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() != this) {
            System.out.println("Przecież nie masz tego samochodu");
        } else if (buyer.cash < price) {
            System.out.println("Nie stać go na ten samochód");
        } else if (seller == buyer) {
            System.out.println("Sobie nie możesz go sprzedać!");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.setCar(seller.getCar());
            seller.takeCar();
            System.out.println("Kupiłeś samochód za: " + price);
        }
    }

}
