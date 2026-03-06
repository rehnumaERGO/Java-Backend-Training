package Day10.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListsExample {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        List<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Banana"); // ArrayList allows duplicates
        System.out.println("Initial ArrayList: " + fruits);

        // 3. Access elements
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Third fruit: " + fruits.get(2));

        // 4. Remove elements
        fruits.remove("Banana"); // removes first occurrence
        fruits.remove(1); // removes element at index 1
        System.out.println("After removal: " + fruits);

        // 5. Update elements
        fruits.set(1, "Pineapple"); // change element at index 1
        System.out.println("After update: " + fruits);

        // 6. Check if element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 7. Sort the list
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);

        // 8. Iterate using for-each
        System.out.println("Iterating:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 9. Iterate using for loop with index
        System.out.println("Iterating using index:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i + ": " + fruits.get(i));
        }

        // 10. Clear the list
        fruits.clear();
        System.out.println("After clear: " + fruits);
    }
}