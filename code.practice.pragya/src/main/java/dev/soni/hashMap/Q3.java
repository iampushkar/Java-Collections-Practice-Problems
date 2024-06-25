package dev.soni.hashMap;

//Create a HashMap to store the mappings of city names to their populations.

import java.util.HashMap;
import java.util.Map;

public class Q3 {

    public static void main(String[] args) {
        Map<String, Long> populationMap = new HashMap<>();
        populationMap.put("Bombay", 10000000L);
        populationMap.put("Bangalore", 20000000L);
        populationMap.put("Chennai", 15000000L);

        populationMap.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
