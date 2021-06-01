package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.salleable;
import com.company.devices.Device;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class Human implements salleable {
        public final String firstName;
        public final String lastName;
        public Pet pet;
        public Phone mobilePhone;
        public Car[] garage;
        public Double cash;
        private Double salary;

        public Human(String firstName, String lastName, int sizeGarage) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.garage = new Car[sizeGarage];

        }

    public Double getSalary(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Informacje o wypłacie (" + this.firstName + " " + this.lastName + ") zostały pobierane " + dtf.format(now) + " wynosiły: " + this.salary);
        return this.salary;
    }
    public void setSalary(Double salary){
        if (salary <= 0){
            try {
                throw new Exception("Nikt nie będzie dopłacał do swojej pracy");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("(" + this.firstName + " " + this.lastName + ") Twoja wypłata wynosi teraz : " + salary);
        System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
        System.out.println("Konieczne jest odebranie aneksu do umowy od pani Hani z kadr.");
        System.out.println("ZUS i US już o wszystkim wiedzą - nie ma sensu ukrywać dochodu.");


        this.salary = salary;

    }

        public Car getCar(int miejsce) {
            return garage[miejsce];
        }
        public void setCar(Car car, int miejsce) {
            garage[miejsce] = car;
        }
        public void takeCar(int miejsce) {
            garage[miejsce] = null;
        }
        public Double getGarageValue() {
            Double garageValue = 0.0;
            for (Device vehicle : this.garage) {
                garageValue += vehicle.value;
            }

            return garageValue;
        }

        public List<Car> sortGarageProductionYear() {
            return Arrays.stream(garage)
                    .sorted(Comparator.comparing(car -> car.yearOfProduction))
                    .collect(Collectors.toList());
        }
        public boolean hasCar(Car newCar){
            for (Car car: garage) {
                if(car == newCar) return true;
            }
            return false;
        }

        public boolean hasFreeSpace(){
            for (Car car: garage) {
                if(car == null) return true;
            }
            return false;
        }

        public void removeCar(Car carToRemove){
            for (int i = 0; i < garage.length; i++){
                if (this.garage[i] == carToRemove){
                    this.garage[i] = null;
                }
            }
        }

        public void addCar(Car newCar){
            for (int i = 0; i < garage.length; i++){
                if (this.garage[i] == null){
                    this.garage[i] = newCar;
                    newCar.owners.add(this);
                    return;
                }
            }
        }

        @Override
        public String toString() {
            return "Human{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", pet=" + pet +
                    ", phone=" + mobilePhone +
                    ", garage=" + Arrays.toString(garage) +
                    ", salary=" + salary +
                    ", cash=" + cash +
                    '}';
        }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

        System.out.println("Nie można handlować ludźmi!");
    }

}
