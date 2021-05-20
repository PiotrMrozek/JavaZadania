package com.company.creatures;
import com.company.creatures.Animal;

import java.io.File;

public class Pet extends Animal {
    public Pet(String species, Double weight, String name, File pic) {
        super(species, weight, name, pic);
    }

    @Override
    public void feed() {
        if (this.weight <= 0.0) {
            System.out.println("Zwierzę:" + this.name + "nie zje nic, bo jest martwe.");
        } else {
            this.weight += 1.0;
            System.out.println("Zwierzę:" + this.name + " zostało nakarmione.");
        }
    }
    @Override
    public void feed(Double foodWeight) {
        if (this.weight <= 0.0) {
            System.out.println("Zwierzę nic nie zje, bo jest martwe.");
        } else {
            this.weight += 1;
            System.out.println("Zwierzę zostało nakarmione i waży:" + this.weight);
        }
    }

    @Override
    public void takeForAWalk() {
        if (this.weight <= 1.0) {
            this.weight = 0.0;
            System.out.println("Zwierzę podczas spaceru prawie umarło z głodu");
        } else {
            System.out.println("Zwierzę zostało wyprowadzone na spacer.");
            if (this.weight == 0.0) {
                System.out.println("Zwierzę odeszło z tego świata");
            } else {
                this.weight -= 1.0;
            }
        }

    }
}
