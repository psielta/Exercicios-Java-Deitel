package ch16.ex15;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ConcatenateTwoLinkedLists {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        list1.add("blue");
        list1.add("red");
        list2.add("black");
        list2.add("white");
        System.out.println(listConcatenate(list1,list2));
    }

    public static <T> LinkedList<T> listConcatenate(LinkedList<T> list1,
                                                LinkedList<T> list2) {
        LinkedList<T> ts = new LinkedList<>(list1);
        for (T e :
                list2) {
            ts.add(e);
        }
        return ts;
    }
}
