package dev.soni.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Q3 {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Hello", 1);
        treeMap.put("World", 2);
        treeMap.put("Java", 3);

        treeMap.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
