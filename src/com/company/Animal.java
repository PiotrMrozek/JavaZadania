package com.company;

import java.io.File;

public class Animal {
    String species;
    Double weight;
    String name;
    File pic;
    private int Weight;

    void feed() {
        try {
            String firstName;
            if (this.weight <= 0.0) {
                throw new Exception( this.name + ". Zwierze nie żyje nie może nic jeść ");
            } else
                System.out.println("Zwierze zostało nakarmione " + this.name);
            this.weight += 1.0;
        }
        catch (Exception Feedex) {
            System.err.println(Feedex);
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

        catch (Exception Walkex) {
            System.err.println(Walkex);
        }
    }
}
