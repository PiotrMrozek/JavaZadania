package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.Disel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {

            Pet dog = new Pet("burek", 16.5, "Azor", null);
            FarmAnimal cow = new FarmAnimal("special", 60.0, "Krówka", null);


            Car passat = new LPG("vw","Passat",1999,1500.0);
            passat.color = "red";
            passat.horsepower = 372;
            passat.mileage = 100000.0;
            passat.engineVolume = 1.9;
            passat.value = 3000.0;

            Phone phone = new Phone("Nokia",
                    "3310",
                    2003,
                    300.0,
                    1.5,
                    "Series30+");

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


            Human krzysztof = new Human("Krzysztof", "Bala",4 );
            krzysztof.setSalary(1000000.0);
            krzysztof.cash = 5000000.0;

            Human human = new Human ("Piotr","Mrozek", 2);
            human.setSalary(1000000.0);
            human.cash = 5000000.0;
            human.addCar(bmw);


            System.out.println("Bmw transakcje: " + bmw.howManyTransactions());


            bmw.sell(human, krzysztof, 10000.0);

            System.out.println("Tesla transakcje: " + tesla.howManyTransactions());
            System.out.println("Bmw transakkcje: " + bmw.howManyTransactions());

            System.out.println("Czy human był właścicielem bmw: " + bmw.wasEverOwner(human));
            System.out.println("Czy Krysztof sprzedał bmw human: " + bmw.SoldBy(human, krzysztof));
            System.out.println("Czy human sprzedał bmw Krzysztof: " + bmw.SoldBy(krzysztof, human));


    }
}
