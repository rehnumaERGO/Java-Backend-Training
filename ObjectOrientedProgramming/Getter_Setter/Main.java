package Getter_Setter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("CHARGER", "YELLOW", 10000);
        // car.model = "Corvette";
        // System.out.println(car.color + " " + car.model + " " + car.price);
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());
        System.out.println(" ");

        car.setColor("Red");
        car.setPrice(20000);
        System.out.println(car.getColor());
        System.out.println(car.getPrice());

    }
}
