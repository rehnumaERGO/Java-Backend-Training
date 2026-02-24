public class Arithmetic {
    public static void main(String[] args) {
        double x = 45;
        double y = 34;
        double z;
        // Arithmetic operations
        z = x + y;
        /*
         * z = x - y;
         * z = x * y;
         * z = x % y;
         * z = x / y;
         */
        System.out.println(z);

        // Augmented Assignment Operators
        double f = 23;
        double r = 12;
        // e = e + r;
        // f += r;
        // f -= r;
        // f *= r;
        // f /= r;
        f %= r;
        System.out.println(f);

        // increment and decrement operator
        int a = 13;
        // a = a + 1;
        a++;
        System.out.println("a: " + a);
        // a = a - 1;
        a--;
        System.out.println("a: " + a);

        // Order of the operators (P-E-D-M-A-S)
        double answer = 2 + 4 * (5 / 3.0) - 23;
        System.out.println(answer);

        // Ternary operator
        // ternary operator ? = Return 1 or 2 values if a condition is true
        /*
         * example:
         * variable = (condition) ? ifTrue : ifFalse;
         */

        String name = " ";
        String username = (name.isBlank()) ? "Name is not given" : "Hello " + name;
        System.out.println(username);

    }
}
