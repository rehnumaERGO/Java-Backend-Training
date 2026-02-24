package Abstraction;

public abstract class Shape {

    abstract double area(); // abstract method (abstract method do not specify a body)

    void display() { // Concrete method
        System.out.println("This is a shape");
    }
}
