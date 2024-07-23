//Write a program to merge two ArrayLists into a single ArrayList.

import java.io.*;
import java.util.*;

class MergeArrayLists {
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
		
		//Merging
		list1.addAll(list2);
		
		//Printing the Final List
		System.out.println("Merged List:: "+ list1);
		
        
        //Closing the Scanner
        sc.close();
		
	}
}