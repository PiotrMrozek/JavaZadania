package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

            Animal dog = new Animal();
            dog.name = "Azor";
            dog.weight = 2.0;
            dog.species = "Canis familiaris";


            Human me = new Human();
            me.firstName = "Piotr";
            me.pet = dog;


            System.out.println(dog.name);
            System.out.println(dog.weight);
            me.pet.feed();
            System.out.println(dog.weight);
            me.pet.takeForAWalk();
            me.pet.takeForAWalk();
            me.pet.takeForAWalk();
            System.out.println(dog.weight);
            me.pet.takeForAWalk();
            me.pet.feed();


            //Zadanie 2

            Car passat = new Car(1,"Passat","vw");
            passat.color = "red";
            passat.horsepower = 372;
            passat.mileage = 100000.0;
            passat.engineVolume = 1.9;
            passat.value = 3000.0;

            System.out.println("takie auto: " + passat.producer + " "+ passat.model);


            me.setSalary(3500.0);
            me.getSalary();

            me.setSalary(1900.0);
            me.getSalary();

            me.setCar(passat);

            Car passat2 = new Car(1,"Passat","vw");
            passat2.color = "red";
            passat2.horsepower = 372;
            passat2.mileage = 100000.0;
            passat2.engineVolume = 1.9;
            passat2.value = 3000.0;

            Phone phone = new Phone("Nokia", "3310", 1.5, "Series30+");

            System.out.println("Comparison:" + (passat == passat2));
            System.out.println("overrided equals():" + passat.equals(passat2));

            System.out.println(me);
            System.out.println(passat);
            System.out.println(phone);
            System.out.println(dog);
    }
}
