import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you wanna buy? : ");
        String item = scanner.next();

        System.out.print("What is the price of each? : ");
        int price = scanner.nextInt();

        System.out.print("How many of these you want? : ");
        int number = scanner.nextInt();

        System.out.println("\nYou have bought " + number + " " + item + "/s");
        System.out.println("Your total amount is $" + (price * number));
        scanner.close();
    }
}
