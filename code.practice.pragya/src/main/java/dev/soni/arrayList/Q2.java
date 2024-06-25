package dev.soni.arrayList;//Write a program to find the maximum element from an ArrayList of Integers.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2{

    public static int maxElement(List<Integer> intList){
        return Collections.max(intList);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(52);
        intList.add(36);
        intList.add(14);
        intList.add(-5);
        System.out.println(maxElement(intList));
    }
}