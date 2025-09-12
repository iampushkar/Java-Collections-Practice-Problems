package MPushkar.PriorityQueue;

import java.util.PriorityQueue;

public class Stack<T> {
    private PriorityQueue<Student> pq1= new PriorityQueue<>(new StackPQ());
    int order=0;

    public void push(String data){
        pq1.add(new Student(data,order++));
    }
    public boolean isEmpty(){
        return pq1.isEmpty();
    }

    public String pop(){
        return pq1.poll().getName();
    }
    public int size(){
        return pq1.size();
    }
    public String peek(){
        return pq1.peek().getName();
    }
}
