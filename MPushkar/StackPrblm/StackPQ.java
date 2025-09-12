package MPushkar.StackPrblm;

import java.util.Collections;
import java.util.PriorityQueue;

public class StackPQ<T> {

    PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> Long.compare(b, a));
    public void push(){
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(1);
        pq.add(7);
        pq.add(2);



    }
    public void pop(){

    }
    public void isEmpty(){

    }

}
