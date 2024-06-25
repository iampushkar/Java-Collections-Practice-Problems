package dev.soni.arrayList;//Write a program to remove all duplicate elements from an ArrayList.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q3{

    public static List<String> removeDuplicates(List<String> strList){
        return strList.stream()
                .distinct()
                .collect(Collectors.toList());
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

        List<String> res = removeDuplicates(strList);
        res.forEach(System.out::println);

    }
}