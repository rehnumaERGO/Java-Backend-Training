public class JavaMethods {
    public static void main(String[] args) {
        // Method = a block of reusable code that is executed when called ()

        String name = "Riki";
        int age = 11;

        happyBirthday(name, age); // order of parameters matter.
        // happyBirthday(name, age);
        // happyBirthday(name, age);

        double number = 3;
        System.out.println(square(number));
        System.out.println(cube(number));
        System.out.println("");

        if (ageCheck(age)) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You need to be 18+ to be an adult!");
        }
        System.out.println("");
        System.out.println(getFullName("Nishimura", "Riki"));

        System.out.println("");
        double result = add(2, 6);
        System.out.println(result);

        System.out.println("");
        System.out.println(add(2, 3, 4));
        num();
    }

    // IF YOU ARE CALLING A METHODS FROM A STATIC METHOD THE IT ALSO NEEDS TO BE
    // STATIC.

    static void happyBirthday(String birthday_person, int years) {
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s\n", birthday_person);
        System.out.printf("You are %d years old!\n", years);
        System.out.println(" ");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static boolean ageCheck(int age) {
        return age > 19;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static void num() {
        int x = 2;
        System.out.printf("This the number inside the method : %d\n", x);
        System.out.println(add(x, x));
    }
}
