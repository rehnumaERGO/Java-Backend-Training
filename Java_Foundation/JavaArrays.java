import java.util.Arrays;
import java.util.Scanner;

public class JavaArrays {
    public static void main(String[] args) {
        String fruits[] = { "Apple", "Mango", "Jackfruit", "Kiwi", "Banana" };
        // fruits[2] = "Pineapple";
        // System.out.println(fruits[2]);

        // for loop
        System.out.println("Unsorted Array");
        System.out.println("------------");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("");

        // Arrays.sort()
        System.out.println("Sorted Array");
        System.out.println("------------");
        Arrays.sort(fruits);
        // for each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("");

        // Arrays.fill()
        System.out.println("Array filled with specified item");
        System.out.println("------------");
        Arrays.fill(fruits, "Pineapple");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("");
        // Declaring an empty array
        String arr[] = {};

        // Enter user input in an array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int number = scanner.nextInt();
        // array assignment with just amount of items but not the items.
        String items[] = new String[number];
        System.out.println("Enter the items of the array: ");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d) ", i + 1);
            String item = scanner.next();
            items[i] = item;
        }

        System.out.println("------------");
        System.out.println("Your array: ");
        for (String item : items) {
            System.out.println(item);
        }

        scanner.close();

    }
}
