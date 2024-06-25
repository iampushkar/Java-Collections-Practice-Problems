package dev.soni.priorityQueue;

import dev.soni.utils.Student;
import dev.soni.utils.StudentComparable;

import java.util.PriorityQueue;

//4. [Implement a PriorityQueue using a custom comparator.](#problem-4)
public class Q4 {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(5, new StudentComparable());
        pq.add(new Student(1, "Pragya", "A"));
        pq.add(new Student(2, "Soni", "B"));
        pq.add(new Student(3, "Rahul", "C"));
        pq.add(new Student(4, "ANita", "D"));
        pq.add(new Student(5, "Rahul", "E"));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
