package Day9_Functional_Programming;

import java.util.*;
import java.util.function.*;

public class LambdaExample {

    // 1️> Custom Functional Interface
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {

        // 2️> Lambda with two parameters
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(5, 3));
        System.out.println("Multiplication: " + multiply.operate(5, 3));

        // 3️> Lambda with one parameter (Predicate)
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        // 4️> Lambda with no parameters (Supplier)
        Supplier<String> greet = () -> "Hello from Lambda!";
        System.out.println(greet.get());

        // 5️> Lambda with Consumer
        Consumer<String> printUpper = str -> System.out.println(str.toUpperCase());

        printUpper.accept("lambda is powerful");

        // 6️> Using lambda with collections
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Even numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println); // Method reference
    }
}