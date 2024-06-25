package dev.soni.hashMap;

//Create a HashMap to store the mappings of employee IDs to their names.

import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        Map<Integer, String> empMap = new HashMap<>();
        empMap.put(101, "Ross");
        empMap.put(102, "Monica");
        empMap.put(110, "Chandler");

        empMap.forEach((k,v) -> System.out.println(k+" : "+v));
    }

}
