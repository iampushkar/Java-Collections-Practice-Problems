package dev.soni.linkedList;
//2. [Implement a Queue using the LinkedList class.](#problem-2)

import dev.soni.utils.Queue;

public class Q2 {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.display();
        System.out.println("front : " + q.front());
        System.out.println("size : "+ q.size());
    }

}
