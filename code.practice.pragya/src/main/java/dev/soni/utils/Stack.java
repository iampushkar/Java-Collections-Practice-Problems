package dev.soni.utils;

public class Stack {

    private Node front;
    private Node rear;
    private int count = 0;

    public Stack(){
        this.front = null;
        this.rear = null;
    }

    public void push(int data){
        Node newData = new Node(data);
        if(front == null)
            front = newData;
        else{
            newData.next = front;
            front = newData;
        }
        count ++;
    }

    public void pop(){
        if(front == null)
            System.out.println("Stack is empty");
        else{
            front = front.next;
            count --;
        }
    }

    public int peek(){
        if(front != null)
            return front.data;
        return -1;
    }

    public int size(){
        return count;
    }

    public void display(){
        Node temp = front;
        if (temp == null)
            System.out.println("Stack is empty");
        else{
            while(temp!=null){
                System.out.print(temp.data + "<-");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
