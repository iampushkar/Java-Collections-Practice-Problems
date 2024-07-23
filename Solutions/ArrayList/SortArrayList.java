//Importing the Libraries
import java.io.*;
import java.util.*;

class SortArrayList {
	public static void main (String[] args) {
	    
	    //Create an ArrayList
	    List<String> stringList = new ArrayList<>();
	    
		//Adding Input to the stringList
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //No of Inputs
		for(int i = 0;i<n;i++){
		    stringList.add(sc.next());
		}
		
		//Sorting the stringList
		Collections.sort(stringList);
		
		// Print the sorted list
        System.out.println("Sorted List: " + stringList);
        
        //Closing the Scanner
        sc.close();
		
	}
}