package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

            Pet dog = new Pet("burek", 16.5, "Azor", null);
            FarmAnimal cow = new FarmAnimal("special", 60.0, "Krówka", null);


            Human me = new Human("Piotr", "Mrozek");
            me.pet = dog;

            Car passat = new Car("vw","Passat",1999,1);
            passat.color = "red";
            passat.horsepower = 372;
            passat.mileage = 100000.0;
            passat.engineVolume = 1.9;
            passat.value = 3000.0;



            Phone phone = new Phone("Nokia", "3310", 2003,1.5, "Series30+");

            dog.feed();
            cow.feed();

            dog.feed(1.5);
            cow.feed(6.0);

            dog.takeForAWalk();

            cow.beEaten();
            cow.beEaten();


    }
}
