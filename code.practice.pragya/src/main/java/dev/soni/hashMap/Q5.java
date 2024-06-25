package dev.soni.hashMap;
//Create a HashMap to store the mappings of employee IDs to their departments.

import java.util.HashMap;
import java.util.Map;

public class Q5 {
    public static void main(String[] args) {
        Map<Integer, String> empMap = new HashMap<>();
        empMap.put(101, "HR");
        empMap.put(102, "IT");
        empMap.put(110, "IT");

        empMap.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
