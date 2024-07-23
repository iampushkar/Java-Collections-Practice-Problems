//Write a program to find the kth smallest element in an ArrayList.

import java.io.*;
import java.util.*;

class KthSmallestElement {
	public static void main (String[] args) {
	    
	    //Create an ArrayList
	    List<Integer> list = new ArrayList<>();
	    
		//Adding Input to the list
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of Input
		int k = sc.nextInt();
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
		
		//check if kth element present 
		if(list.size()<k){
		    System.out.println("kth Smallest not present");
		}
		else{
		    System.out.println("Kth Smallest Element: "+list.get(k-1));
		}
        
		
	}
}