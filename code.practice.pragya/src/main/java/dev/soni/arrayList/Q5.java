package dev.soni.arrayList;//Write a program to find the intersection of two ArrayLists.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q5{
    public static List<String> getIntersection(List<String> list1, List<String> list2){
        return list1.stream()
                .distinct()
                .filter(list2 :: contains)
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

        List<String> strList2 = new ArrayList<>();
        strList2.add("Soni1");
        strList2.add("Pragya");
        strList2.add("Soni");
        strList2.add("James");
        strList2.add("Mary");
        strList2.add("Mary4");
        strList2.add("Monica");
        strList2.add("Mary");

        List<String> res = getIntersection(strList, strList2);
        res.forEach(System.out::println);


    }
}