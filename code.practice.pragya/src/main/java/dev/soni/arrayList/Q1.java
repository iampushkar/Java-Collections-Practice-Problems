package dev.soni.arrayList;
//Write a program to sort an ArrayList of Strings alphabetically.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1{
    public static void sort(List<String> strList){
        Collections.sort(strList);
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("@Soni");
        strList.add("Pragya");
        strList.add("tapan");
        strList.add("1Riday");
        strList.add("Amar");
        sort(strList);
        System.out.println(strList);
    }
}