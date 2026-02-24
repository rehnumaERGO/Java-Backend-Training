import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int[] numbers = { 1, 3, 4, 5, 6, 9, 12, 32, 34 };
        // boolean isFound = false;
        // System.out.print("Enter the target value: ");
        // int target = scanner.nextInt();
        // for (int i = 0; i < numbers.length; i++) {
        // if (target == numbers[i]) {
        // System.out.printf("Target found on index: %d", i);
        // isFound = true;
        // break;
        // }
        // }
        // if (!isFound) {
        // System.out.println("Target is not found in the array");
        // }

        String fruits[] = { "Apple", "Mango", "Jackfruit", "Kiwi", "Banana" };
        boolean isFound = false;
        System.out.print("Enter the target value: ");
        String target = scanner.nextLine();
        for (int i = 0; i < fruits.length; i++) {
            if (target.equalsIgnoreCase(fruits[i])) {
                System.out.printf("Target found on index: %d", i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Target is not found in the array");
        }
        scanner.close();
    }
}
