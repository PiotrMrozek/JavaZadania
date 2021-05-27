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
            super(producer, model, yearOfProduction, value);

    }
        public String toString() {
            return "\nCar {\n" +
                    "   producer = '" + producer + '\'' +
                    ",\n   model = '" + model + '\'' +
                    ",\n   engineVolume = " + engineVolume +
                    ",\n   value = " + value +
                    ",\n   yearOfProduction = " + yearOfProduction +
                    ",\n   horsepower = " + horsepower +
                    ",\n   color = " + color +
                    "\n}\n";
        }
    @Override
    public void turnOn() {
        System.out.println("Samochód:" + producer + " " + model + "został odpalony");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
          if (seller.hasCar(this)) {
            throw new Exception("Sprzedający nie ma tego samochodu");
        } if (buyer.hasFreeSpace()) {
            throw new Exception("Kupujący nie ma miejsca w garażu");
        } if (buyer.cash < price){
            throw new Exception("Nie ma tylu pieniędzy");
        }
          seller.removeCar(this);
          buyer.addCar(this);
          seller.cash += price;
          buyer.cash -= price;
          System.out.println("Sprzedano!");
        }

        public abstract void refuel();
}
