package Abstraction;

/*
Abstraction = Used to define abstract classes and methods.
Abstraction is the process of hiding implementation details and showing only the essential features.
Abstract classes CAN'T be instantiated directly.
Can contain 'abstract' methods (which must be implemented).
Can contain 'concrete' methods (which are inherited).
*/
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        Rectangle rectangle = new Rectangle(4, 8);
        Triangle triangle = new Triangle(4, 9);

        circle.display();
        double value = circle.area();
        System.out.printf("%.2f", value);
        System.out.println(" ");
        rectangle.display();
        System.out.println(rectangle.area());
        System.out.println(" ");
        triangle.display();
        System.out.println(triangle.area());

    }
}
