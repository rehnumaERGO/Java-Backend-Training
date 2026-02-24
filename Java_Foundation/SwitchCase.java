import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter the day: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day) {
        case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Its is a weekday");
        case "Saturday", "Sunday" -> System.out.println("Its the Weekend");
        default -> System.out.printf("%s not a day", day);
        }
        scanner.close();

    }
}
