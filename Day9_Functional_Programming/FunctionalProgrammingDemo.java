package Day9_Functional_Programming;

import java.util.*;
import java.util.stream.Collectors;

public class FunctionalProgrammingDemo {
        public static void main(String[] args) {
                List<Customer> customers = Arrays.asList(
                                new Customer("Alice", 450),
                                new Customer("Bob", 700),
                                new Customer("Charlie", 300),
                                new Customer("David", 900));

                // 1. Filter customers with premium >= 500
                List<Customer> highPremium = customers.stream()
                                .filter(c -> c.premium >= 500)
                                .collect(Collectors.toList());
                System.out.println("High Premium Customers:");
                highPremium.forEach(System.out::println);

                // 2. Calculate total premium
                double totalPremium = customers.stream()
                                .mapToDouble(c -> c.premium)
                                .sum();
                System.out.println("\nTotal Premium: " + totalPremium);

                // 3. Sort customers by premium descending
                List<Customer> sorted = customers.stream()
                                .sorted((c1, c2) -> Double.compare(c2.premium, c1.premium))
                                .collect(Collectors.toList());
                System.out.println("\nCustomers Sorted by Premium (desc):");
                sorted.forEach(System.out::println);
        }
}
