//Create a HashSet and add some elements to it. Then, print the elements of the HashSet.

import java.io.*;
import java.util.*;

class HashSetUse {
	public static void main (String[] args) {
	    
	    //Creating a HashSet
	    Set<Integer> set = new HashSet<>();

        // Add Input to the set
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //no of inputs
        
        for(int i = 0;i<n;i++){
            set.add(sc.nextInt());
        }
        sc.close();
        
        // Print all the elements
        for (int ele:set) {
            System.out.println(ele);
        }

	}
}