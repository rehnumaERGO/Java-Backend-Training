package Day10.Functional_prog;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        // 1.Finding the Second Largest Number in the array.
        // Demonstrates sorting + skip + findFirst.
        int[] numbers = { 10, 25, 40, 5, 30 };

        int secondLargest = Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Largest: " + secondLargest);

        System.out.println(" ");

        // 2.Counting the Vowels in a String.
        // Uses char stream + filtering + count.
        String text = "Functional Programming in Java";

        long count = text.toLowerCase()
                .chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();

        System.out.println("Number of vowels: " + count);

        System.out.println(" ");

        // 3.Remove Duplicate Characters from a String.
        // Uses distinct + mapping.
        String word = "programming";

        String result = word.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Without duplicates: " + result);

        System.out.println(" ");

        // 4.Find Longest Word in a Sentence.
        String sentence = "Java functional programming streams example";

        String longest = Arrays.stream(sentence.split(" "))
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                .get();

        System.out.println("Longest word: " + longest);
    }
}