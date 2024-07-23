//Create a HashMap to store the mappings of employee IDs to their names.

import java.io.*;
import java.util.*;

class EmployeeMap {
	public static void main (String[] args) {
	    
	    //Creating a HashMap
	    Map<String, String> map = new HashMap<>();

        // Add Input mappings to the HashMap
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //No of Employees
        
        for(int i = 0;i<n;i++){
            map.put(sc.next(),sc.next());
        }

        // Print all mappings
        System.out.println("Employee & Id Mappings:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

	}
}