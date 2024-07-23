//Create a LinkedList and perform various operations like add, remove, and iterate over it.

import java.io.*;
import java.util.*;

class LinkedListOpn {
	public static void main (String[] args) {
	    
	    //Create an LinkedList
	    List<Integer> intList = new LinkedList<>();
	    
		//Adding Input to the intList
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of Inputs
		for(int i = 0;i<n;i++){
		    intList.add(sc.nextInt());
		}
		
		//Add operation
		System.out.println("Adding another element: "+10);
		intList.add(10);
		
		//iterate and Print
		System.out.println("Iterating over the LinkedList...");
		for(int ele:intList){
		    System.out.print(ele+" ");
		}
		
		System.out.println();
		
		//Removing element
		System.out.println("Removing the last element...");
		intList.remove(n);
		
		//Printing the Final List
		System.out.println("Final List: "+ intList);
		
        
        //Closing the Scanner
        sc.close();
		
	}
}