package com.company.devices;

public class Application {
    public String name;
    public String version;
    public Double price;

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;

    }
    @Override
    public String toString() {
        return "Application{" +
                "name = '" + name + '\'' +
                ", version = '" + version + '\'' +
                ", price = " + price +
                "} \n";
    }
    public String getName() {
        return name;
    }
    public String getVersion() {
        return version;
    }
    public Double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
