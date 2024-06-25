package dev.soni.arrayList;//Write a program to check if a HashSet is a subset of another HashSet.

import java.util.*;

public class Q13 {

    public static boolean isSubset(Set<String> set1, Set<String> set2){
        return set1.containsAll(set2);
    }

    public static void main(String[] args) {
        Set<String> setList1 = new HashSet<>();
        setList1.add("Soni");
        setList1.add("Chandler");
        setList1.add("James");
        setList1.add("Mary");

        Set<String> setList2 = new HashSet<>();
        setList2.add("Soni");
        setList2.add("Mary");
        setList2.add("Chandler");

        System.out.println(isSubset(setList1, setList2));


    }

}