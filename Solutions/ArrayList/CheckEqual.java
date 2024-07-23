//Write a program to check if two LinkedLists are equal.

import java.io.*;
import java.util.*;

class CheckEqual {
	public static void main (String[] args) {
	    
	    //Create two LinkedList
        List<Integer> list1 = new LinkedList<>();
	    List<Integer> list2 = new LinkedList<>();
	    
		//Adding Input to the lists
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of Inputs of first list
		for(int i = 0;i<n;i++){
		    list1.add(sc.nextInt());
		}
		
		n = sc.nextInt(); //No of Inputs of second list
		for(int i = 0;i<n;i++){
		    list2.add(sc.nextInt());
		}
		
		if(list1.equals(list2)){
		    System.out.println("Equal");
		}
		else{
		    System.out.println("Not Equal");
		}
		
        //Closing the Scanner
        sc.close();
		
	}
}