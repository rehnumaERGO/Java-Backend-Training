package Day9_Functional_Programming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Mango");
        List<Integer> list2 = List.of(1, 4, 5, 7, 9);
        printBasic(list);
        System.out.println(" ");
        printWithFP(list);
        System.out.println(" ");
        printBasicWithFiltering(list);
        System.out.println(" ");
        printWithFPWithFiltering(list);
        System.out.println(" ");
        printWithFPOdd(list2);
        System.out.println(" ");
        printWithFPEven(list2);
    }

    private static void printBasic(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(element -> System.out.println("element - " + element));
    }

    private static void printBasicWithFiltering(List<String> list) {
        for (String string : list) {
            if (string.endsWith("a"))
                System.out.println(string);
        }
    }

    private static void printWithFPWithFiltering(List<String> list) {
        list.stream().filter(element -> element.endsWith("a"))
                .forEach(element -> System.out.println("element - " + element));
    }

    private static void printWithFPOdd(List<Integer> list2) {
        list2.stream().filter(element -> element % 2 == 1)
                .forEach(element -> System.out.println(element));
    }

    private static void printWithFPEven(List<Integer> list2) {
        list2.stream().filter(element -> element % 2 == 0)
                .forEach(element -> System.out.println(element));
    }
}
