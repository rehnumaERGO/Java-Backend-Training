package Day8_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("APPLE", "BAT", "CAT");
        System.out.println(words);
        // words.add("doll"); //immutable

        System.out.println(" ");
        // ArrayList, vector, LinkedList can be used to make a mutable list.

        List<String> wordsArrayList = new ArrayList<String>(words);
        List<String> wordsLinkedList = new LinkedList<String>(words);
        List<String> wordsVector = new Vector<String>(words);

        // LinkedList
        wordsLinkedList.add("Doll");
        System.out.println(wordsLinkedList);

        System.out.println(" ");

        // Vector
        wordsVector.add("Drag");
        System.out.println(wordsVector);

        System.out.println(" ");
        // ArrayList
        wordsArrayList.add("ball");
        wordsArrayList.add(2, "ball");
        System.out.println(wordsArrayList);

        System.out.println(" ");

        List<String> newList = List.of("Yak", "egg");
        wordsArrayList.addAll(newList);
        System.out.println(wordsArrayList);

        System.out.println(" ");

        wordsArrayList.remove("ball");
        wordsArrayList.remove(1);
        System.out.println(wordsArrayList);

        System.out.println(" ");

        // Iterate an ArrayList
        Iterator wordIterator = wordsArrayList.iterator();

        while (wordIterator.hasNext()) {
            System.out.println(wordIterator.next());
        }

        System.out.println(" ");

        for (String word : words) {
            if (word.endsWith("at")) {
                System.out.println(word);
            }
        }

    }
}
