package Day10.Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        // 1. Create a HashSet
        Set<String> fruits = new HashSet<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate ignored
        System.out.println("Initial HashSet: " + fruits);

        // 3. Remove an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // 4. Check if element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 5. Size of the set
        System.out.println("Size: " + fruits.size());

        // 6. Iterate using for-each
        System.out.println("Iterating using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 7. Clear the set
        fruits.clear();
        System.out.println("After clear: " + fruits);
    }
}