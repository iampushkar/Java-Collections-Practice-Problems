package MPushkar.StackPrblm;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Stack<T> {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty(){
        return top==null;
    }
    public void push(int data){
        Node newNode= new Node(data);
        newNode.next=top;
        top=newNode;
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("stack is underflow");
        }int poppedData= top.data;
        top=top.next;
        return poppedData;
    }
    public int peek(){
        if(isEmpty()){
            System.out.print("stack is Empty");
            return -1;
        }
        return top.data;

    }
    public void display(){
        if(isEmpty()) {
            System.out.print("stack is Empty");
            return;
        }
        Node current = top;
        while(current!=null){
            System.out.println(current.data +"->");
            current=current.next;

        }
        System.out.println("null");
    }
}
