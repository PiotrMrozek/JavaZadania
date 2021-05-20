package com.company.creatures;

import java.io.File;

import com.company.salleable;

    public abstract class Animal implements salleable, Feedable {
    public String species;
    public Double weight;
    public String name;
    public File pic;

    public Animal(String species, Double weight, String name, File pic) {
        this.species = species;
        this.weight = weight;
        this.name = name;
        this.pic = pic;
    }


    public String toString() {
        return "Gatuek:" + species + "Waga:" + weight + "Nazwa:" + name + "Zdjęcie:" + pic;
    }

        abstract public void feed();
        abstract public void takeForAWalk();

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != this) {
            System.out.println("Zwierze nie należy do Ciebie!");
        } else if (buyer.cash < price) {
            System.out.println("Nie stać go na niego!");
        } else if (seller == buyer) {
            System.out.println("Nie możesz kupić swojego zwierzaka!");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Zwierze zostało sprzedanie cena to:" + price);
        }
    }
}
