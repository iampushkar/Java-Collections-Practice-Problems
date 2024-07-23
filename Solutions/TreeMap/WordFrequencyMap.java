//Create a TreeMap to store the mappings of words to their frequencies in a given text.

import java.io.*;
import java.util.*;

class WordFrequencyMap {
	public static void main (String[] args) {
	    
	    //Creating a TreeMap
	    Map<String, Integer> map = new TreeMap<>();

        // Add Input mappings to the TreeMap
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); //Input Text
        sc.close();
        
        //Adding word & frequencies to the map
        for(String word: text.split(" ")){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        // Print all mappings
        System.out.println("Word & Frequency mappings are :");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

	}
}