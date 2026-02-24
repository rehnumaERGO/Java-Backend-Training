public class JavaVarargs {
    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4, 5));
        System.out.println(average(1, 2, 3, 4));
    }
    // varargs = allows a method to accept a varying amount of arguments.
    // it makes it more flexible, no need fro overloaded methods.
    // Java will pack these variables into an array.
    // ... (ellipsis)

    static double add(double... numbers) {
        int sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers) {
        double sum = add(numbers);
        double arvg = sum / (numbers.length);
        return arvg;
    }
}
