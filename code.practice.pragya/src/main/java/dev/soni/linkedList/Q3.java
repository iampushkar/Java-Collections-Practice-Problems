package dev.soni.linkedList;

import dev.soni.utils.Stack;

public class Q3 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
