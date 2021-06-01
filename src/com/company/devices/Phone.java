package com.company.devices;

    import com.company.creatures.Human;
    import com.company.salleable;
    import java.util.List;
    import java.util.ArrayList;
    import java.util.Comparator;

    public class Phone extends Device implements salleable {

    final Double screenSize;
    final String operatingSystem;
        List<Application> apps;

    public Phone(String producer, String model,int yearOfProduction, Double value, Double screenSize, String operatingSystem) {

        super(producer, model, yearOfProduction, value);

        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.apps = new ArrayList<>();
    }
        public void installAnApp(Human owner, Application app) {
            if (owner.cash < app.getPrice()) {
                System.out.println("Nie masz pieniędzy na apkę!");
            } else {
                owner.cash -= app.getPrice();
                this.apps.add(app);
                System.out.println("Zainstalowano");
            }
        }

        public boolean hasApp(Application appObj) {
            for (Application app : apps) {
                if (app == appObj) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasApp(String appName) {
            for (Application app : apps) {
                if (app.getName().equals(appName)) {
                    return true;
                }
            }
            return false;
        }
        public void printFreeApps() {
            for (Application app : apps) {
                if (app.getPrice() == 0.0) {
                    System.out.print(app + " ");
                }
            }
        }
        public void printAllApps() {
            for (Application app : apps) {
                System.out.print(app + " ");
            }
        }
        public void printAppsAlphabet() {
            apps.sort(Comparator.comparing(Application::getName));
            for (Application app : apps) {
                System.out.print(app + " ");
            }
            System.out.println();
        }
        public void printAllAppsByPrice() {
            apps.sort(Comparator.comparingDouble(Application::getPrice));
            for (Application app : apps) {
                System.out.print(app + " ");
            }
            System.out.println();
    }
        @Override
        public String toString() {
            return "Phone {" +
                    "producer='" + producer + '\'' +
                    ", model='" + model + '\'' +
                    ", yearOfProduction=" + yearOfProduction +
                    ", screenSize=" + screenSize +
                    ", operatingSystem='" + operatingSystem + '\'' +
                    '}';
        }
    @Override
    public void turnOn() {
        System.out.println("Telefon:" + producer + " " + model + " włącza się.");
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.mobilePhone != this) {
            System.out.println("Nie posiadasz tego telefonu!");
        } else if (buyer.cash < price) {
            System.out.println("Nie stać go na ten telefon");
        } else if (seller == buyer) {
            System.out.println("Nie możesz sprzedać sobie telefonu!");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;
            System.out.println("Telefon się sprzedał.");
        }
    }
}
