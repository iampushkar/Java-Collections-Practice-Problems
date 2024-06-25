package dev.soni.TreeSet;

//Create a TreeSet and add elements to it. Then, print the elements in sorted order.

import java.util.Set;
import java.util.TreeSet;

public class Q1 {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Soni");
        treeSet.add("Pragya");
        treeSet.add("Soni");
        treeSet.add("James");
        treeSet.add("Mary");

        treeSet.forEach(System.out::println);
    }
}
