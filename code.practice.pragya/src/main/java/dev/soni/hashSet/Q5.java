package dev.soni.hashSet;

//Create a TreeMap to store the mappings of words to their frequencies in a given text.

import java.util.Map;
import java.util.TreeMap;

public class Q5 {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Hello", 1);
        treeMap.put("World", 2);
        treeMap.put("Java", 3);

        treeMap.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
