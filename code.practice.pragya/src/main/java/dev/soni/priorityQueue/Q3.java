package dev.soni.priorityQueue;

import java.util.PriorityQueue;

//3. [Implement a priority queue using a custom comparator.](#problem-3)
public class Q3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        pq.add(10);
        pq.add(45);
        pq.add(90);
        pq.add(40);
        pq.add(50);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
