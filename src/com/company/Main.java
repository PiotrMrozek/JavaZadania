package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.Disel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

            Pet dog = new Pet("burek", 16.5, "Azor", null);
            FarmAnimal cow = new FarmAnimal("special", 60.0, "Krówka", null);


            Human me = new Human("Piotr", "Mrozek");
            me.pet = dog;

            Car passat = new LPG("vw","Passat",1999,1500.0);
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

            phone.installAnApp("Allegro");
            phone.installAnApp("Allegro", "1.6");
            phone.installAnApp("Allegro", "1.6.9", "Allegro.pl");

            Car tesla = new Electric("Tesla", "xyz", 2015, 350000.0);
            tesla.refuel();
            Car bmw = new LPG("Bmw", "E 60", 2004,  35000.0);
            bmw.refuel();
            Car clio = new Disel("Renault", "Clio", 2014, 45000.0);
            clio.refuel();

            List<String> app = new ArrayList<>();
            app.add("Facebook");
            app.add("Origin");
            app.add("Discord");

            phone.installAnApp(app);

    }
}
