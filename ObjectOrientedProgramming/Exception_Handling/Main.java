package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Exception = An event that interrupts the normal flow of a program like Dividing by zero, file not  found, mismatch input type.
Surround any dangerous code with a try{} block.
- try{}, catch{}, finally{}
*/

public class Main {
    public static void main(String[] args) {
        // Dangerous code
        // System.out.println(1 / 0);

        // try {
        // System.out.println(1 / 0);
        // } catch (ArithmeticException e) {
        // System.out.println("You can't divide anything with zero");
        // }
        // throw , throws , checked exceptions and unchecked exceptions
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("This wasn't a number!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This will run anyways");
        }
    }
}
