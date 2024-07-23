//Create a HashMap to store the mappings of country names to their capitals.

import java.io.*;
import java.util.*;

class CountryCapitalMap {
	public static void main (String[] args) {
	    
	    //Creating a HashMap
	    Map<String, String> map = new HashMap<>();

        // Add mappings to the HashMap
        map.put("United States", "Washington, D.C.");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Japan", "Tokyo");
        map.put("India", "New Delhi");

        // Print all mappings
        System.out.println("Country-Capital Mappings:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

	}
}