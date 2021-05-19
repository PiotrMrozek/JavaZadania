package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

            Animal dog = new Animal();
            dog.name = "Azor";
            dog.weight = 2.0;
            dog.species = "Canis familiaris";


            Human me = new Human();
            me.firstName = "Piotr";
            me.pet = dog;
            me.setSalary(6000.0);



            Car passat = new Car("vw","Passat",1999,1);
            passat.color = "red";
            passat.horsepower = 372;
            passat.mileage = 100000.0;
            passat.engineVolume = 1.9;
            passat.value = 3000.0;


            me.setCar(passat);

            Car passat2 = new Car("vw","Passat",1999,1);
            passat2.color = "red";
            passat2.horsepower = 372;
            passat2.mileage = 100000.0;
            passat2.engineVolume = 1.9;
            passat2.value = 3000.0;

            Phone phone = new Phone("Nokia", "3310", 2003,1.5, "Series30+");

            System.out.println("Comparison:" + (passat == passat2));
            System.out.println("overrided equals():" + passat.equals(passat2));

            me.mobilePhone = phone;
            me.cash = 100.0;
            Human ziom = new Human();
            ziom.cash = 1500.0;

            phone.sell(me, me, 450.0);
            phone.sell(ziom, me, 450.0);
            phone.sell(me, ziom, 8093.0);
            phone.sell(me, ziom, 450.0);

            System.out.println(me.mobilePhone);
            System.out.println(ziom.mobilePhone);

            dog.sell(me, ziom, 400.0);
            System.out.println(me.pet);
            System.out.println(ziom.pet);

            Human Piotr = new Human();
            Piotr.sell(me, ziom, 150.0);

            passat.sell(me, ziom, 3200.0);
            System.out.println(me.getCar());
            System.out.println(ziom.getCar());


    }
}
