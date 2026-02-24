import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        /*
         * System.out.print("How many numbers you want? : "); int num =
         * scanner.nextInt(); for (int i = 1; i <= num; i++) { System.out.println(i);
         * Thread.sleep(1000); } System.out.println("Happy New Year!!!");
         */
        /*
         * for (int i = 1; i <= 3; i++) { for (int j = 1; j <= num; j++) {
         * System.out.print(j + " "); } System.out.println(" "); }
         */

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (var value : arr) {
            System.out.print(value + " ");
        }
        scanner.close();
    }
}
