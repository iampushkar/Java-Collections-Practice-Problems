//Create a TreeSet of custom objects and implement the Comparable interface for sorting.

import java.io.*;
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int age;
    
    //Constructor
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int compareTo(Student that){
        if(this.age == that.age) return this.name.compareTo(that.name);
        
        return Integer.compare(this.age,that.age);
    }
}
class CustomComparableTreeSet {
	public static void main (String[] args) {
	    
	    //Creating a TreeSet
	    Set<Student> set = new TreeSet<>();

        // Add Input to the set
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //no of inputs
        
        for(int i = 0;i<n;i++){
            set.add(new Student(sc.next(),sc.nextInt()));
        }
        
        sc.close();
        
        // Print all the elements
        System.out.println("Printing the Set");
        for (Student ele:set) {
            System.out.println("Name: "+ele.name + " Age: "+ele.age);
        }
        
    

	}
}