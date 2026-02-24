package Interface_Polymorphism;

/*
Polymorphism =  "POLY" = "MANY"
                "MORPH" = "SHAPE"
                Objects an identify as other objects.
                Objects can be treated as objects of a common superclass.
*/
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
        car.go();
        bike.go();
        boat.go();

        System.out.println(" ");
        // Trying to store different type of objects in an array, of any one the type of
        // objects we are storing.
        // Car[] cars = { car, bike, boat }; //didn't work

        Vehicle[] vehicles = { car, bike, boat };
        /*
         * car is identified as Car but also Vehicle because Car class implements the
         * Vehicle interface and same for the other objects too.
         * car has a shape of Car and of Vehicle.
         */

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
