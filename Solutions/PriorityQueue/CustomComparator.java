//Implement a priority queue using a custom comparator.

import java.io.*;
import java.util.*;

class CustomComparator {
	public static void main (String[] args) {
	    //*** Taking Input ***
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of elements
		
		//Creating Custom Comparator
// 		Comparator<String> comp = new Comparator<>(){
// 		    public int compare(String a, String b){
// 		        return Integer.compare(a.length(),b.length());
// 		    }
// 		};
		
		//Creating a PriorityQueue using custom comparator
// 		PriorityQueue<String> pq = new PriorityQueue<>(comp);
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)-> Integer.compare(a.length(),b.length()));
		
		//Adding Input elements into it
		for(int i = 0;i<n;i++){
		    pq.add(sc.next());
		}
		
		sc.close();
		
		//*** Printing the Elements in Sorted Order ***
		while(!pq.isEmpty()){
		    System.out.print(pq.poll()+" ");
		}
	}
}