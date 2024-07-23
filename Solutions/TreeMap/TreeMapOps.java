//Create a TreeMap and add elements to it. Then, print the elements in sorted order of keys.

import java.io.*;
import java.util.*;

class TreeMapOps {
	public static void main (String[] args) {
	    
	    //Creating a TreeMap
	    Map<String, String> map = new TreeMap<>();

        // Add Input mappings to the HashMap
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //No of Employees
        
        for(int i = 0;i<n;i++){
            map.put(sc.next(),sc.next());
        }

        // Print all mappings
        System.out.println("Sorted mappings are :");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

	}
}