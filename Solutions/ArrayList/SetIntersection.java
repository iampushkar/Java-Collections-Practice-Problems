//Write a program to find the intersection of multiple Sets.

import java.io.*;
import java.util.*;

class SetIntersection {
	public static void main (String[] args) {
	    
	    //Create an ArrayList
        List<Set<Integer>> listOfSets = new ArrayList<>();
	    
		//Adding Input to the lists
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of sets
		for(int i = 0;i<n;i++){
		    
		    int m = sc.nextInt(); //Size of Current set
		    Set<Integer> set = new HashSet<>();
		    
		    for(int j = 0;j<m;j++){
		        set.add(sc.nextInt());
		    }
		    
		    //Add the Current set in the listOfSets
		    listOfSets.add(set);
		}
		
		//intersection
		for(int i = 1;i<n;i++){
		    listOfSets.get(0).retainAll(listOfSets.get(i));
		}
		
		//Printing the Final List
		System.out.println("Intersection of all sets:: "+ listOfSets.get(0));
		
        
        //Closing the Scanner
        sc.close();
		
	}
}