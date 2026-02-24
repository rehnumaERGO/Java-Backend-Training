package Composition;

/*
Composition = Represents a 'part-of' relationship between objects.
For example- an Engine is 'part of' a Car.
Allows complex objects to be constructed from smaller objects.
*/

//Real world scenario - please compare compositon and aggregation
public class Main {
    public static void main(String[] args) {
        /*
         * if we delete our Car object that should also delete our engine object
         * because it is a part of the Car.
         */
        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.engine.type);
        System.out.println(car.year);
        System.out.println(car.model);
        System.out.println(" ");

        car.start();

        // Engine engine = new Engine("v3");
        // engine.start();

    }
}
