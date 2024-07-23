//Write a program to remove all duplicate elements from an ArrayList.

import java.io.*;
import java.util.*;

class RemoveDuplicates {
	public static void main (String[] args) {
	    
	    //Create an ArrayList
	    List<Integer> intList = new ArrayList<>();
	    
		//Adding Input to the intList
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of Inputs
		for(int i = 0;i<n;i++){
		    intList.add(sc.nextInt());
		}
		
		//Create a set of the ArrayList
		Set<Integer> set = new LinkedHashSet<>(intList);
		
		//Removing Duplicates from the ArrayList
		intList.clear();
		intList.addAll(set);
		
		// Print the list of the unique elements
        System.out.println("List after removing duplicates: " + intList);
        
        //Closing the Scanner
        sc.close();
		
	}
}