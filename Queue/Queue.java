package MPushkar.Queue;

import java.util.ArrayDeque;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
//First In First Out
public class Queue<T> {

    private Node head =null;
    private Node tail=null;

    public boolean isEmpty(){
     return head==null;
    }
    public void offer(int data){
        Node newNode= new Node(data);
        if(tail!=null)
            tail.next=newNode;

        tail=newNode;
        if(head==null)
            head=newNode;
    }

    public int poll(){
        if(head==null)
            return -1;
       int val=head.data;
       head=head.next;
       if(head==null){
           tail=null;
       }
       return val;
    }
    public int peek(){
        if(head!=null)
        return head.data;
       return -1;
    }
    public int size(){
        Node cur=head;
        int val=0;

        while(cur!=tail)
        {val++;
         cur=cur.next;
        }
        val=val+1;
        return val;
    }
    public void display(){
        if(isEmpty()) {
            System.out.print("Queue is Empty");
            return;
        }
       Node current = head;
        while(current!=tail){
            System.out.print(current.data +"->");
            current=current.next;

        }
        System.out.print(current.data );
    }
}
