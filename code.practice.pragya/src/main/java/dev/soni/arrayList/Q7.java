package dev.soni.arrayList;//Write a program to find the second-largest element in an ArrayList of Integers.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q7{
    public static int secondLargest(List<Integer> list1){
        Collections.sort(list1);
        int secondLargest = list1.get(list1.size()-2);
        return secondLargest;
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(21);
        intList.add(13);
        intList.add(45);
        intList.add(57);
        intList.add(86);
        intList.add(7);
        System.out.println(secondLargest(intList));

    }
}