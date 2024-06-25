package dev.soni.hashMap;
//Create a HashMap to store the mappings of product names to their prices.


import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) {
        Map<String, Float> productMap = new HashMap<>();
        productMap.put("Orange Juice", 100F);
        productMap.put("JIM JAM", 25F);
        productMap.put("Wheat FLour", 63.6F);

        productMap.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
