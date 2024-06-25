package dev.soni.arrayList;//Write a program to find the frequency of each element in an ArrayList.

import java.util.*;

public class Q8{
    public static Map<Integer, Integer> freqMap(List<Integer> list1){
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : list1)
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        return freqMap;
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(1);
        intList.add(13);
        intList.add(45);
        intList.add(8);
        intList.add(8);
        intList.add(7);
        intList.add(8);
        intList.add(7);
        intList.add(10);
        Map<Integer, Integer> res = freqMap(intList);
        res.forEach((k,v) -> System.out.println(k+" : "+v));

    }
}