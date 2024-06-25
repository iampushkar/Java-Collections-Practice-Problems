package dev.soni.linkedList;

//1. [Create a LinkedList and perform various operations like add, remove, and iterate over it.](#problem-1)

import java.util.LinkedList;

public class Q1 {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList);

        linkedList.remove(2);

        linkedList.forEach(System.out::println);


    }
}
