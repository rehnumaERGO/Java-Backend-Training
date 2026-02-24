package Class_Objects;

public class Car {
    // Attributes
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start() {
        System.out.println("you start the engine");
        isRunning = true;
    }

    void stop() {
        System.out.println("You stopped the engine");
        isRunning = false;
    }

    void drive() {
        System.out.println("You drive the " + model);
    }

    void brake() {
        System.out.println("You put brakes on the " + model);
    }
}
