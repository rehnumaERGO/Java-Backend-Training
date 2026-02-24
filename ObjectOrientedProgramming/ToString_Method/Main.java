package ToString_Method;

/*
.toString method = Method inherited from the object class.
Used to return a string representation of an object.
By default, it returns a hash code as a unique identifier.
It can be overridden to provide meaningful details.
*/
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "mustang", 2024, "Red");
        System.out.println(car);
        // System.out.println(car.color + " " + car.year + " " + car.make + " " +
        // car.model);
    }
}
