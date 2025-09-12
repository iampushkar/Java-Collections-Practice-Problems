package MPushkar.PriorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Queue<T>
{
    private  PriorityQueue<Student>  pq1= new PriorityQueue<>(new QueuePQ());
    int order=0;

    public void offer(String data){
        pq1.add(new Student(data,order++));
    }
    public boolean isEmpty(){
        return pq1.isEmpty();
    }

    public String remove(){
       return pq1.poll().getName();
    }
    public int size(){
        return pq1.size();
    }
    public String peek(){
        return pq1.peek().getName();
    }

//    public static void main(String[] args) {
//        PriorityQueue<Student>  pq1= new PriorityQueue<>(new QueuePQ());
//        pq1.add(new Student("Malice",1));
//        pq1.add(new Student("tob",2));
//        pq1.add(new Student("datherine",3));
//        pq1.add( new Student("Jhon",4));
//        System.out.println("Process the task in order of priority");
//        while(!pq1.isEmpty()){
//            System.out.println(pq1.poll().getName());
//        }

//    }
}
