package dev.soni.arrayList;//Write a program to find the kth smallest element in an ArrayList.

import java.util.*;

public class Q9 {
    public static int smallestKElement(List<Integer> list1, int k){
        Collections.sort(list1);
        return list1.get(k-1);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(61);
        intList.add(13);
        intList.add(45);
        intList.add(81);
        intList.add(18);
        intList.add(57);
        intList.add(98);
        intList.add(37);
        intList.add(10);

        System.out.println(smallestKElement(intList, 3));
    }
}