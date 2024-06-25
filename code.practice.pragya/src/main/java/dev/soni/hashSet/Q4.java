package dev.soni.hashSet;

//Write a program to find the common elements between two ArrayLists.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("Soni");
        l1.add("Pragya");
        l1.add("Ross");

        List<String> l2 = new ArrayList<>();
        l2.add("Monica");
        l2.add("Chandler");
        l2.add("Ross");

        l1.retainAll(l2);
        System.out.println(l1);
    }
}
