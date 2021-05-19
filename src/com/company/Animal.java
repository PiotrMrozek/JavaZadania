package com.company;

import java.io.File;

public class Animal implements salleable {
    String species;
    Double weight;
    String name;
    File pic;
    private int Weight;

    public String toString() {
        return "Gatuek:" + species + "Waga:" + weight + "Nazwa:" + name + "Zdjęcie:" + pic;
    }

    void feed() {
        try {
            String firstName;
            if (this.weight <= 0.0) {
                throw new Exception( this.name + ". Zwierze nie żyje nie może nic jeść ");
            } else
                System.out.println("Zwierze zostało nakarmione " + this.name);
            this.weight += 1.0;
        }
        catch (Exception feedex) {
            System.err.println(feedex);
        }
    }
    void takeForAWalk() {
        try {

            this.weight -= 1;

            if (this.weight <= 0.0) {
                this.weight = 0.0;
                throw new Exception(this.name + " nie żyje");

            }

            if (this.Weight == 1) {
                System.out.println( this.name + "Jest po spacerze");

            } else
                System.out.println(this.name + "Został już wyprowadzony");
        }

        catch (Exception walkex) {
            System.err.println(walkex);
        }
    }
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
