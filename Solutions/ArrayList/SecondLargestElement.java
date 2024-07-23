//Write a program to find the second-largest element in an ArrayList of Integers.
//2<=n

import java.io.*;
import java.util.*;

class SecondLargestElement {
	public static void main (String[] args) {
	    
	    //Create an ArrayList
	    List<Integer> list = new ArrayList<>();
	    
		//Adding Input to the list
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of Input
		for(int i = 0;i<n;i++){
		    list.add(sc.nextInt());
		}
		
		//Closing the Scanner
        sc.close();
		
		//Removing Duplicates
		Set<Integer> set = new HashSet<>(list);
		list.clear();
		list.addAll(set);
		
		//sort the list
		Collections.sort(list);
		
		//check if 2nd element present 
		if(list.size()<2){
		    System.out.println("2nd Largest not present");
		}
		else{
		    System.out.println("2nd Largest Element: "+list.get(list.size()-2));
		}
        
		
	}
}