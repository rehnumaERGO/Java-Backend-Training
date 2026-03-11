import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // String value
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println(" ");

        // int value
        System.out.print("what is your age? ");
        int age = scanner.nextInt();
        System.out.println("you are " + age + " years old");

        System.out.println(" ");

        System.out.print("Enter your favorite color: ");
        String color = scanner.next();
        System.out.println("you like " + color + " color");

        System.out.println(" ");

        // double value
        System.out.print("what is your grade: ");
        double grade = scanner.nextDouble();
        System.out.println("your garde is " + grade);

        System.out.println(" ");

        // boolean value
        System.out.print("Are you a student?(true/false): ");
        boolean isStudent = scanner.nextBoolean();
        if (isStudent) {
            System.out.println("you are eligible for the student discount");
        } else {
            System.out.println("you are not eligible for the student discount");
        }

        scanner.close();
    }

}
