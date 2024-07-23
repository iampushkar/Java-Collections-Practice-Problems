//Write a program to find the intersection of two ArrayLists.

import java.io.*;
import java.util.*;

class IntersectionOfArrayLists {
	public static void main (String[] args) {
	    
	    //Create two ArrayLists
	    List<String> list1 = new ArrayList<>();
	    List<String> list2 = new ArrayList<>();
	    
		//Adding Input to the lists
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of Inputs of first list
		for(int i = 0;i<n;i++){
		    list1.add(sc.next());
		}
		
		n = sc.nextInt(); //No of Inputs of second list
		for(int i = 0;i<n;i++){
		    list2.add(sc.next());
		}
		
		//Finding intersection
		list1.retainAll(list2);
		
		//Printing the Final List
		System.out.println("Intersection of the two lists:: "+ list1);
		
        
        //Closing the Scanner
        sc.close();
		
	}
}