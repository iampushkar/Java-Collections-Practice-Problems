//Implement a Stack using the PriorityQueue class with a custom comparator.

import java.io.*;
import java.util.*;

 class Element{
    String s;
    int index;
    
    public Element(String s,int index){
        this.s = s;
        this.index = index;
    }
}
class StackImplementation {
	public static void main (String[] args) {
	    //*** Taking Input ***
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of elements
		
// 		Creating Custom Comparator
		Comparator<Element> comp = new Comparator<>(){
		    public int compare(Element a, Element b){
		        return Integer.compare(b.index,a.index);
		    }
		};
		
		//Creating a PriorityQueue using custom comparator
		PriorityQueue<Element> pq = new PriorityQueue<>(comp);
        
		//Adding Input elements into it
		for(int i = 0;i<n;i++){
		    pq.add(new Element(sc.next(),i));
		}
		
		sc.close();
		
		//*** Printing the Elements in Sorted Order ***
		while(!pq.isEmpty()){
		    Element ele = pq.poll();
		    System.out.println(ele.index+"-> "+ele.s);
		}
	}
}