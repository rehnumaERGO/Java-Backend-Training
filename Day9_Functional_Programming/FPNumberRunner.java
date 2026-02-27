package Day9_Functional_Programming;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 6, 7, 4, 3);
        int sum = 0;
        // NormalSum(numbers, sum);
        sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
        System.out.println(sum);

    }

    private static void NormalSum(List<Integer> numbers, int sum) {
        for (Integer integer : numbers) {
            sum += integer;
        }
    }
}
