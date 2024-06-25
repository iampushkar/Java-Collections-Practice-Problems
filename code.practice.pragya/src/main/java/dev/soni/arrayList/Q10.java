package dev.soni.arrayList;//Write a program to merge two ArrayLists into a single ArrayList.

import java.util.*;

public class Q10 {

    public static boolean mergeList(List<String> list1, List<String> list2){
        return list1.addAll(list2);
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

        List<String> strList2 = new ArrayList<>();
        strList2.add("Soni");
        strList2.add("Pragya");
        strList2.add("Soni");
        strList2.add("James");
        strList2.add("Mary");
        strList2.add("Mary2");
        strList2.add("Monica");
        strList2.add("Mary");

        mergeList(strList, strList2);
        System.out.println(strList);
    }

}