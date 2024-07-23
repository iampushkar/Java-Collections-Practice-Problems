//Write a program to find the frequency of each element in an ArrayList.

import java.io.*;
import java.util.*;

class FrequencyOfElement {
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
		
		//Finding Frequency 
		Map<Integer,Integer> map = new HashMap<>();
		for(int ele:list){
		    map.put(ele,map.getOrDefault(ele,0)+1);
		}
		
		//Printing the Frequency of Each Element 
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
		    System.out.println("Element: "+entry.getKey() +" "+"Frequency: "+entry.getValue());
		}
        
		
	}
}