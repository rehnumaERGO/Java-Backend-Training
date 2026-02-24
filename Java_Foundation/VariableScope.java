public class VariableScope {
    static int x = 3; // CLASS VARIABLE

    public static void main(String[] args) {
        int x = 1; // A VARIABLE INSIDE A METHOD HAS LOCAL SCOPE //LOCAL VARIABLE
        System.out.println(x);
        doSomething();

    }

    static void doSomething() {
        int x = 2; // local variable of this method
        System.out.println(x);
    }
}
