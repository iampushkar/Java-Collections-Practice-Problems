package dev.soni.utils;

public class LinkedList {

    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp!=null){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" , ");
            temp= temp.next;
        }
        System.out.println();
    }
}
