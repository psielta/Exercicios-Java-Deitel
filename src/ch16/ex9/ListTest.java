package ch16.ex9;// Fig. 16.3: ListTest.java

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>(Arrays.asList("black", "yellow", "green", "blue", "violet", "silver"));
        List<String> list2 = new LinkedList<>(Arrays.asList("gold", "white", "brown", "blue", "gray", "silver"));

        list1.addAll(list2); // concatenate lists
        list2 = null; // release resources
        printList(list1); // print list1 elements

        convertToUppercaseStrings(list1); // convert to uppercase string
        printList(list1); // print list1 elements

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7); // remove items 4-6 from list
        printList(list1); // print list1 elements
        printReversedList(list1); // print list in reverse order
    }

    // output List contents
    private static void printList(List<String> list) {
        System.out.printf("%nlist:%n");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.valueOf(i) + " - " + list.get(i));
        }

        System.out.println();
    }

    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next(); // get item
            iterator.set(color.toUpperCase()); // convert to upper case
        }
    }

    private static void removeItems(List<String> list,
                                    int start, int end) {
        list.subList(start, end).clear(); // remove items
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.printf("%nReversed List:%n");

        // print list in reverse order
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }
}


