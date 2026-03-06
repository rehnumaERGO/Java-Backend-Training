package Day10.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // 1. Create a HashMap
        Map<String, Integer> fruitCount = new HashMap<>();

        // 2. Add key-value pairs
        fruitCount.put("Apple", 3);
        fruitCount.put("Banana", 2);
        fruitCount.put("Orange", 5);
        System.out.println("Initial HashMap: " + fruitCount);

        // 3. Access value by key
        System.out.println("Count of Apple: " + fruitCount.get("Apple"));

        // 4. Remove a key
        fruitCount.remove("Banana");
        System.out.println("After removal: " + fruitCount);

        // 5. Update a value
        fruitCount.put("Apple", 10);
        System.out.println("After update: " + fruitCount);

        // 6. Check if key exists
        System.out.println("Contains key Orange? " + fruitCount.containsKey("Orange"));

        // 7. Check if value exists
        System.out.println("Contains value 5? " + fruitCount.containsValue(5));

        // 8. Iterate over entries
        System.out.println("Iterating over entries:");
        for (Map.Entry<String, Integer> entry : fruitCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 9. Iterate over keys only
        System.out.println("Keys:");
        for (String key : fruitCount.keySet()) {
            System.out.println(key);
        }

        // 10. Iterate over values only
        System.out.println("Values:");
        for (Integer value : fruitCount.values()) {
            System.out.println(value);
        }

        // 11. Clear the map
        fruitCount.clear();
        System.out.println("After clear: " + fruitCount);
    }
}