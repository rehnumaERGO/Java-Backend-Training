package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
ArrayList = A resizeable array, that stores objects (autoboxing).
Arrays are fixed in size, but ArrayLists can change.
*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList list3 = new ArrayList<>();

        // List<Integer> names = new ArrayList<>();

        // names.add(1);
        // names.add(2);
        // names.add(3);

        // int a = names.get(2);

        // list3.add(3);
        // list3.add(4);

        // int b = (int) list3.get(1);
        // System.out.println("List 3 " + list3.get(1));

        list1.add(3);
        list1.add(1);
        list1.add(2);
        System.out.println(list1);

        System.out.println(" ");

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(3.2);
        list2.add(1.1);
        list2.add(2.45);
        System.out.println(list2);

        System.out.println(" ");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        System.out.println(fruits);

        fruits.remove(0);
        System.out.println(fruits);

        fruits.set(0, "Pineapple");
        System.out.println(fruits);
        System.out.println(" ");
        System.out.println(fruits.get(2));
        System.out.println(" ");
        System.out.println(fruits.size());

        System.out.println(" ");

        Collections.sort(fruits);
        System.out.println(fruits);

        System.out.println(" ");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
