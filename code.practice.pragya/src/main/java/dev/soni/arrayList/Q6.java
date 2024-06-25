package dev.soni.arrayList;//Write a program to shuffle the elements of an ArrayList.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q6 {
    public static List<String> shuffle(List<String> list1){
        Collections.shuffle(list1);
        return list1;
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Soni");
        strList.add("Pragya");
        strList.add("Soni");
        strList.add("James");
        strList.add("Mary");
        strList.add("Mary2");
        strList.add("Monica");
        strList.add("Mary");
        List<String> res = shuffle(strList);
        res.forEach(System.out::println);


    }
}