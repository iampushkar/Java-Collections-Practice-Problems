package dev.soni.TreeMap;
//Create a TreeMap to store the mappings of book titles to their authors.


import java.util.Map;
import java.util.TreeMap;

public class Q2 {

    public static void main(String[] args) {
        Map<String, String> bookMap = new TreeMap<>();
        bookMap.put("The Alchemist", "Paulo Coelho");
        bookMap.put("The Da Vinci Code", "Dan Brown");
        bookMap.put("The Kite Runner", "Khaled");

        bookMap.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
