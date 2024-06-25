package dev.soni.stack;

import java.util.Stack;

//1. [Implement a Stack using the Stack class in Java.](#problem-1)
public class Q1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        while(!stack.isEmpty())
            System.out.print(stack.pop()+" , ");
        System.out.println();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        while(!stack.isEmpty())
            System.out.print(stack.pop()+" , ");
        System.out.println();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("top : " + stack.peek());
        System.out.println("size : "+ stack.size());
    }
}
