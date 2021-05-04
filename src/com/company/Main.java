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


    }
}
