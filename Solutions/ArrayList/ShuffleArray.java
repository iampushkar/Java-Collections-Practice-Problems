//Write a program to shuffle the elements of an ArrayList.

import java.io.*;
import java.util.*;

class ShuffleArray {
	public static void main (String[] args) {
	    
	    //Create an ArrayList
	    List<String> list = new ArrayList<>();
	    
		//Adding Input to the list
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of Input
		for(int i = 0;i<n;i++){
		    list.add(sc.next());
		}
		
		//Printing the original list
		System.out.println("original list:: "+ list);
		
		//shuffle the list
		Collections.shuffle(list);
		
		//Printing the Final List
		System.out.println("shuffled list:: "+ list);
		
        //Closing the Scanner
        sc.close();
		
	}
}