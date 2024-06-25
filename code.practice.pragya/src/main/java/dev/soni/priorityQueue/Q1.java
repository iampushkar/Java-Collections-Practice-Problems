package dev.soni.priorityQueue;
//1. [Implement a PriorityQueue and add elements to it. Then, print the elements in sorted order.](#problem-1)

import java.util.PriorityQueue;

public class Q1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(70);
        pq.add(40);
        pq.add(50);

        while(!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
