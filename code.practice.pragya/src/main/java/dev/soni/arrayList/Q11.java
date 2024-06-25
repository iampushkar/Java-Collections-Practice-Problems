package dev.soni.arrayList;//Write a program to find the intersection of multiple Sets.

import java.util.*;

public class Q11{
    public static boolean intersectSets(Set<String> set1, Set<String> set2){
        return set1.retainAll(set2);
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

        intersectSets(setList1, setList2);
        System.out.println(setList1);

    }
}