package ToString_Method;

public class Car {
    String model;
    String make;
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        // String value = this.color + " " + this.year + " " + this.make + " " +
        // this.model;
        // return value;
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
