import java.util.Scanner;

public class MathsLibrary {
    public static void main(String[] args) {
        System.out.println("pi : " + Math.PI);
        System.out.println("e : " + Math.E);
        System.out.println(Math.abs(-2.3));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(4, 5));
        System.out.println(Math.max(24, 67));

        /*
         * // hypotenuse
         * Scanner scanner = new Scanner(System.in);
         * System.out.print("Enter value of a: ");
         * double num1 = scanner.nextDouble();
         * System.out.print("Enter value of b: ");
         * double num2 = scanner.nextDouble();
         * double result = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
         * System.out.printf("The hypotenuse is %.1fcm\n ", result);
         * scanner.close();
         */
        // printf method - string formatting
        int age = 45;
        double money = 2300.253;
        boolean value = true;
        char currency = '$';
        String name = "Aisha";
        System.out.printf("The name is %s\n", name);
        System.out.printf("Her age is %d years old\n", age);
        System.out.printf("Its %b that %s has %c%.2f in the bank account.\n", value, name, currency, money);
        System.out.println(" ");
        int n1 = 1;
        int n2 = 23;
        int n3 = 561;
        int n4 = 7890;
        System.out.printf("%4d\n", n1);
        System.out.printf("%4d\n", n2);
        System.out.printf("%4d\n", n3);
        System.out.printf("%4d\n", n4);

    }
}