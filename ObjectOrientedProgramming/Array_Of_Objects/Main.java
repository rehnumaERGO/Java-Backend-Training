package Array_Of_Objects;

public class Main {
    public static void main(String[] args) {
        // Cars car1 = new Cars("Mustang", "Red");
        // Cars car2 = new Cars("Corvette", "blue");
        // Cars car3 = new Cars("Charger", "Yellow");

        // Cars[] cars = new Cars[3];
        // Cars[] cars = { car1, car2, car3 };
        // for (int i = 0; i < cars.length; i++) {
        // cars[i].drive();
        // }

        // Anonymous objects ¬
        Cars[] cars = { new Cars("Mustang", "Red"), new Cars("Corvette", "blue"), new Cars("Charger", "Yellow") };

        for (Cars car : cars) {
            car.color = "black";
        }

        for (Cars car : cars) {
            car.drive();
        }
    }
}
