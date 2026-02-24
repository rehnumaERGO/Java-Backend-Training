package Day6_Exception_Handling;

import java.util.ArrayList;
import java.util.Scanner;
/*
Problem: Use ArrayLists to manage dynamic customer lists and handle invalid input errors without crashing.
Goal: Manage dynamic data and ensure robust error handling.
*/

public class CustomerManager {
    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter customer name: ");
                String name = scanner.nextLine();

                if (name.isEmpty()) {
                    throw new IllegalArgumentException("Customer name cannot be empty");
                }
                customers.add(name);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("Customer List: " + customers);
    }
}