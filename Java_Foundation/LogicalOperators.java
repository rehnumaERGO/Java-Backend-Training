import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature? : ");
        double temp = scanner.nextDouble();
        System.out.print("Is it sunny outside? : ");
        boolean isSunny = scanner.nextBoolean();
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is Good and sunny outside 🌞");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good and cloudy outside ☁️");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad");
        }
        scanner.close();
    }
}
