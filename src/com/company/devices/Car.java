package com.company.devices;


    import com.company.creatures.Human;
    import com.company.salleable;
    import java.time.LocalDate;
    public abstract class Car extends Device implements salleable {

    public String color;
    public Double mileage;
    public Double engineVolume;
    public Double value;
    public int horsepower;

        public Car(String producer, String model, int yearOfProduction, Double value) {
            super(producer, model, yearOfProduction);
        this.value = value;

    }
    //public String toString() {
        //return id+" "+producer+" "+model+" "+yearOfProduction+" "+mileage+ " " + horsepower+" "+color+" "+ engineVolume+" "+value;

    @Override
    public void turnOn() {
        System.out.println("Samochód:" + producer + " " + model + "został odpalony");
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
        public abstract void refuel();
}
