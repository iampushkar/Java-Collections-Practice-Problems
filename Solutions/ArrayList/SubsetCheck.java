//Write a program to check if a HashSet is a subset of another HashSet.

import java.io.*;
import java.util.*;

class SubsetCheck {
	public static void main (String[] args) {
	    
	    //Create two HashSet
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
	    
		//Adding Input to the sets
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of Inputs of first list
		for(int i = 0;i<n;i++){
		    set1.add(sc.nextInt());
		}
		
		n = sc.nextInt(); //No of Inputs of second list
		for(int i = 0;i<n;i++){
		    set2.add(sc.nextInt());
		}
		
		if(set1.containsAll(set2)){
		    System.out.println("set2 is a subset of set1.");
		}
		else{
		    System.out.println("Not a subset");
		}
		
        //Closing the Scanner
        sc.close();
		
	}
}