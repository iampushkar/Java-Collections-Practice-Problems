package dev.soni.priorityQueue;

import java.util.PriorityQueue;

//2. [Implement a priority queue using the PriorityQueue class.](#problem-2)
public class Q2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(70);
        pq.add(40);
        pq.add(50);

        while(!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
