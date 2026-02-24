import java.util.Scanner;
import java.util.Random;

public class WhileLoops {
    public static void main(String[] args) {
        // System.out.println("You have entered the game!");
        Scanner scanner = new Scanner(System.in);
        /*
         * String response = ""; while (!response.equals("N")) {
         * System.out.println("Game Started");
         * System.out.print("Type out your number: "); int number = scanner.nextInt();
         * Random random = new Random(); int num = random.nextInt(0, 1000); if (num ==
         * number) { System.out.println("you are correct"); } else {
         * System.out.println("You lost"); }
         * System.out.print("You want to play again? (Y/N) : "); response =
         * scanner.next().toUpperCase(); } System.out.println("You have quit the game");
         */

        int x = 5;
        do {
            System.out.printf("x = %d \n", x);
            x--;
        } while (x > 0);
        scanner.close();
    }
}
