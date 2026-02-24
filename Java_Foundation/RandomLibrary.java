import java.util.Random;

public class RandomLibrary {
    public static void main(String[] args) {
        Random random = new Random();

        /*
         * // Generate random integers between 10 (inclusive) and 20 (exclusive)
         * for (int i = 0; i < 5; i++) {
         * int num = random.nextInt(10, 20);
         * System.out.println(num);
         * }
         */

        /*
         * // double
         * double number = random.nextDouble(12, 34);
         * System.out.println(number);
         */

        // boolean - Coin flips

        boolean isHeads = random.nextBoolean();
        if (isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
