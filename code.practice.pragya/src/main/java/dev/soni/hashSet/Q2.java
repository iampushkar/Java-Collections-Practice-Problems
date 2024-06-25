package dev.soni.hashSet;

//Write a program to check if a particular element exists in a HashSet.

import java.util.HashSet;
import java.util.Set;

public class Q2 {

    public static boolean isElementExists(Set<String> set, String element){
        return set.contains(element);
    }
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Soni");
        set.add("Chandler");
        set.add("James");
        set.add("Mary");

        System.out.println(isElementExists(set, "Mary1"));
    }
}
