package com.company;

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

            Car passat = new Car("Passat", "vw");
            passat.color = "red";
            passat.millage = 100000.0;
            passat.engineVolume = 1.9;

            System.out.println("takie auto: " + passat.producer + " "+ passat.model);

            me.car = passat;
            System.out.println("Mam auto: " + me.car.model);



    }
}
