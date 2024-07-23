//Implement a PriorityQueue and add elements to it. Then, print the elements in sorted order.

import java.io.*;
import java.util.*;

class ImplementPriorityQueue {
	public static void main (String[] args) {
	    //*** Taking Input ***
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of elements
		
		//Creating a PriorityQueue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//Adding Input elements into it
		for(int i = 0;i<n;i++){
		    pq.add(sc.nextInt());
		}
		
		sc.close();
		
		//*** Printing the Elements in Sorted Order ***
		while(!pq.isEmpty()){
		    System.out.print(pq.poll()+" ");
		}
	}
}