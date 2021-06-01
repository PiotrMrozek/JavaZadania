package com.company;

import com.company.creatures.Human;
import com.company.devices.Phone;
import com.company.devices.Application;



public class Main {

    public static void main(String[] args) throws Exception {

           
            Phone phone = new Phone("Nokia",
                    "3310",
                    2003,
                    300.0,
                    1.5,
                    "Series30+");
            
            Human human = new Human ("Piotr","Mrozek", 2);
            human.setSalary(1000000.0);
            human.cash = 5000000.0;
            human.mobilePhone = phone;

            Application ts = new Application("TeamSpeak", "1.3.0", 15.0);
            Application dc = new Application("Discord", "1.5.9", 0.0);
            Application tinder = new Application("Tinder", "9.5.9", 0.0);

            phone.installAnApp(human, ts);
            phone.installAnApp(human, tinder);
            System.out.println(phone.hasApp(ts));
            System.out.println(phone.hasApp(dc));
            System.out.println(phone.hasApp("TeamSpeak"));
            System.out.println(phone.hasApp("Discord"));

            phone.printFreeApps();
            System.out.println(" ");
            phone.printAllApps();
            System.out.println(" ");
            phone.printAppsAlphabet();
            System.out.println(" ");
            phone.printAllAppsByPrice();
    }
}
