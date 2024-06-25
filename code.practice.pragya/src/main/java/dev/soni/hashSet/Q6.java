package dev.soni.hashSet;

//Write a program to check if a HashSet is a subset of another HashSet.

import java.util.Set;

public class Q6 {

    public static void main(String[] args) {
        Set<String> set1 = Set.of("Soni", "Chandler", "James", "Mary");
        Set<String> set2 = Set.of("Soniii", "M1ary", "1Chandler");

        System.out.println(set1.containsAll(set2));
    }
}
