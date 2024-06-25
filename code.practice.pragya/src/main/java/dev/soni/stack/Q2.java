package dev.soni.stack;

import dev.soni.utils.Stack;

//2. [Implement a Stack using the LinkedList class.](#problem-2)
public class Q2 {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.display();

        s.pop();

        s.display();
    }
}
