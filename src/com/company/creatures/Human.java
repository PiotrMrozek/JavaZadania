package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.salleable;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class Human implements salleable {
        public final String firstName;
        public final String lastName;
        public Pet pet;

    public Phone mobilePhone;
    private Car car;
    public Double cash;
    private Double salary;

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
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

    public Car getCar(){
        return this.car;
    }
    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("Udało się kupić za gotówkę.");
            this.car = car;
        }
        else if (this.salary > (car.value/12)) {
            System.out.println("Udało się kupić na kredyt. (No trudno)");
            this.car = car;
        } else
            System.out.println("Zapisz się na studia, znajdź nową robotę albo idź po podwyżkę.");
    }

    public String toString() {
        return firstName+""+lastName+"Zwierze:"+pet+"Telefon"+mobilePhone+"Samochód"+car+"Pensja:"+salary;
    }
    public void takeCar() {
        this.car = null;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

        System.out.println("Nie można handlować ludźmi!");
    }

}
