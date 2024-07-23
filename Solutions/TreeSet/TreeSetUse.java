//Create a TreeSet and add elements to it. Then, print the elements in sorted order.

import java.io.*;
import java.util.*;

class TreeSetUse {
	public static void main (String[] args) {
	    
	    //Creating a TreeSet
	    Set<Integer> set = new TreeSet<>();

        // Add Input to the set
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //no of inputs
        
        for(int i = 0;i<n;i++){
            set.add(sc.nextInt());
        }
        
        int element = sc.nextInt();
        
        sc.close();
        
        // Print all the elements
        System.out.println("Printing the Set");
        for (int ele:set) {
            System.out.print(ele + " ");
        }
        
    

	}
}