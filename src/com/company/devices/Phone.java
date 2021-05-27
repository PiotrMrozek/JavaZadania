package com.company.devices;

    import com.company.creatures.Human;
    import com.company.salleable;
    import java.net.MalformedURLException;
    import java.net.URL;
    import java.util.List;

    public class Phone extends Device implements salleable {

    final Double screenSize;
    final String operatingSystem;
        static final String DEFAULT_SERVER_PROTOCOL = "Https";
        static final String DEFAULT_SERVER_ADDRESS = "111.0.0.1";
        static final String DEFAULT_VERSION_NAME = "latest";

    public Phone(String producer, String model,int yearOfProduction, Double screenSize, String operatingSystem) {

        super(producer, model, yearOfProduction);

        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }
    public String toString() {
        return producer+" "+model+" "+screenSize+" "+operatingSystem+" "+yearOfProduction;
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
        public void installAnApp(String appName) {
            this.installAnApp(appName, DEFAULT_VERSION_NAME);
        }
        public void installAnApp(String appName, String version) {
            this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
        }
        public void installAnApp(String appName, String version, String serverAddress) {
            URL appLink = null;
            try {
                appLink = new URL(DEFAULT_SERVER_PROTOCOL, serverAddress, appName + "_" + version);
                this.installAnApp(appLink);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        public void installAnApp(URL appURL) {
            System.out.println("Pobieranie aplikacji " + appURL.getFile() + " z " + appURL.getHost());
            System.out.println("Sprawdzanie, czy aplikacja jest płatna");
            System.out.println("Sprawdzanie posiadania pieniędzy");
            System.out.println("Sprawdzanie posiedania miejsca");
            System.out.println("Jeśli aplikacja jest bezpłatna lub opłacona to rozpakowywuje");
            System.out.println("Instalowanie aplikacji " + appURL.getFile());
        }
        public void installAnApp(List<String> app) {
            String[] lista = new String[app.size()];
            lista = app.toArray(lista);
            this.installAnApp(lista);
        }
        public void installAnApp(String[] app) {
            for (String appName: app) {
                this.installAnApp(appName);
            }
        }

}
