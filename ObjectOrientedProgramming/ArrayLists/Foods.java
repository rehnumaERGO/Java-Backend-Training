package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Foods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many food items you would like? : ");
        int number = scanner.nextInt();

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter the food items");
        for (int i = 0; i < number; i++) {
            System.out.printf("Food item #%d : ", i + 1);
            list.add(scanner.next());
        }
        System.out.println("Your food list is : " + list);
        scanner.close();
    }
}
