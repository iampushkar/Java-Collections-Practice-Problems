package dev.soni.hashSet;

//Create a HashSet and add some elements to it. Then, print the elements of the HashSet.

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(3);

        hashSet.forEach(System.out::println);
    }
}
