package dev.soni.utils;

public class Queue {
    private Node front;
    private Node rear;
    private int count = 0;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data){
        Node newData = new Node(data);
        newData.next = front;
        front = newData;
        count ++;
    }

    public void dequeue(){
        if(front == null)
            System.out.println("empty queue");
        else{
            front = front.next;
            if(front == null)
                rear = null;
            count --;
        }
    }

    public int front(){
        if(front != null)
            return front.data;
        return -1;
    }

    public int size(){
        return count;
    }

    public void display(){
        Node temp =front;
        if(temp == null)
            System.out.println("Queue is empty");
        else{
            while(temp!=null){
                System.out.print(temp.data+"<-");
                temp = temp.next;
            }
        }
        System.out.println();
    }
}
