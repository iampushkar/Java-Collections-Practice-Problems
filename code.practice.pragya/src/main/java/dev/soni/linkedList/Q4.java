package dev.soni.linkedList;
//4. [Write a program to check if two LinkedLists are equal.](#problem-4)

import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);
        linkedList2.add(4);
        linkedList2.add(5);

        System.out.println(linkedList1.equals(linkedList2));
    }
}
