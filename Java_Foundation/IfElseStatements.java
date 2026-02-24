import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Name
        System.out.print("what is your name? : ");
        String name = scanner.nextLine();

        // 1st block
        if (name.isEmpty()) {
            System.out.print("You didn't tell you name!");
        } else {
            System.out.print("Hello " + name);
        }

        // Age
        System.out.print("\nwhat is your age? : ");
        int age = scanner.nextInt();

        // 2nd block
        if (age >= 60) {
            System.out.print("You are a senior citizen");
        } else if (age >= 18) {
            System.out.print("You are an adult");
        } else if (age < 0) {
            System.out.print("You don't exist");
        } else if (age == 0) {
            System.out.print("You are a baby");
        } else if (age < 18) {
            System.out.print("You are a minor");
        }

        System.out.print("\nAre you a student?(true/false) : ");
        boolean isStudent = scanner.nextBoolean();
        if (isStudent) {
            System.out.print("You are enrolled");
        } else {
            System.out.print("You are not a student");
        }
        scanner.close();
    }
}