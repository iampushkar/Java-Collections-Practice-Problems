//Write a program to find the maximum element from an ArrayList of Integers.

import java.io.*;
import java.util.*;

class FindMax {
	public static void main (String[] args) {
	    
	    //Create an ArrayList
	    List<Integer> intList = new ArrayList<>();
	    
		//Adding Input to the intList
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of Inputs
		for(int i = 0;i<n;i++){
		    intList.add(sc.nextInt());
		}
		
		// Print the maximum element
        System.out.println("Maximum element: " + Collections.max(intList));
        
        //Closing the Scanner
        sc.close();
		
	}
}