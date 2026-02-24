package Class_Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Object = An entity that holds data (attributes) and can perform actions
         * (methods).
         * It is a reference data type (means we keep data for an object in a location
         * called
         * heap)
         */
        Car car = new Car();
        car.isRunning = true;
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println(" ");

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println(" ");

        car.drive();
        car.brake();

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println(" ");

        // All the objects have same attributes here
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);
    }
}
