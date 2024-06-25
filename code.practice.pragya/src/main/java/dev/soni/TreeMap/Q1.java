package dev.soni.TreeMap;

//Create a TreeMap and add elements to it. Then, print the elements in sorted order of keys.

import java.util.Map;
import java.util.TreeMap;

public class Q1 {

    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Soni", 1);
        treeMap.put("Pragya", 2);
        treeMap.put("James", 3);

        treeMap.forEach((k,v) -> System.out.println(k+" : "+v));
    }

}
