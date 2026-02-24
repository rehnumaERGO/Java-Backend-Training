package Day1_Basics;

import java.util.Scanner;

/*
Problem: Calculate insurance premium with different rates based on user age input.
Goal: Practice arithmetic and logical operations and user input handling.
*/
public class InsurancePremiumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer's age: ");
        int age = scanner.nextInt();

        double basePremium = 10000;
        double premium;

        // Premium calculation using arithmetic and logical operators
        if (age < 25) {
            premium = basePremium * 1.2; // 20% increase
        } else {
            premium = basePremium;
        }

        System.out.println("Calculated premium: " + premium);
        scanner.close();
    }
}
