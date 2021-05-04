package devices;

public class Car {
    public final int id;
    public final String model;
    public final String producer;
    public String color;
    public Double mileage;
    public Double engineVolume;
    public Double value;
    public int horsepower;

    public Car (int id, String model, String producer){
        this.model = model;
        this.id = id;
        this.producer = producer;
    }
    public String toString() {
        return id+" "+producer+" "+model+" "+mileage+ " " + horsepower+" "+color+" "+ engineVolume+" "+value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return id == car.id &&
                model.equals(car.model) && mileage.equals(car.mileage) && horsepower == car.horsepower && color.equals(car.color) && engineVolume.equals(car.engineVolume) &&
                value.equals(car.value) &&
                producer.equals(car.producer);
    }

    @Override
    public int hashCode() {
        return id;
    }

}
