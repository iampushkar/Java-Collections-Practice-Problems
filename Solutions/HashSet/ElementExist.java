//Write a program to check if a particular element exists in a HashSet.

import java.io.*;
import java.util.*;

class ElementExist {
	public static void main (String[] args) {
	    
	    //Creating a HashSet
	    Set<Integer> set = new HashSet<>();

        // Add Input to the set
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //no of inputs
        
        for(int i = 0;i<n;i++){
            set.add(sc.nextInt());
        }
        
        int element = sc.nextInt();
        
        sc.close();
        
        // Print all the elements
        System.out.println("Original Set");
        for (int ele:set) {
            System.out.print(ele + " ");
        }
        
        System.out.println();
        
        //Checking if ele present in the HashSet
        if(set.contains(element)){
            System.out.println(element + " Exists in the HashSet");
        }
        else{
            System.out.println(element + " Doesn't Exist in the HashSet");
        }

	}
}