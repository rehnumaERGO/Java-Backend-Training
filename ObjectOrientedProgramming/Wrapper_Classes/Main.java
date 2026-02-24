package Wrapper_Classes;

/*
wrapper classes = allows primitive values(int, char, double, boolean) to be used as objects.
Generally, don't wrap primitives unless you need an object.
Allows use of collections framework and static Utility Methods.
*/
public class Main {
    public static void main(String[] args) {
        /*
         * // Boolean x = new Boolean("true");
         *
         * // Autoboxing
         * int a = 2;
         * double b = 2.3;
         * char c = 'f';
         * boolean e = true;
         *
         * // Unboxing
         * int x = a;
         * double y = b;
         * char z = c;
         * boolean q = e;
         *
         */

        /*
         * String a = Integer.toString(123);
         * String b = Double.toString(3.14);
         * String c = Character.toString('@');
         * String d = Boolean.toString(false);
         *
         * String e = a + b + c + d;
         * System.out.println(e);
         *
         */

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        Boolean d = Boolean.parseBoolean("true");

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
