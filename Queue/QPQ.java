package MPushkar.Queue;

import java.util.PriorityQueue;

public class QPQ<T> {
    PriorityQueue<Integer> pq=new PriorityQueue<>();

    public boolean  isEmpty(){
        return pq.isEmpty();
    }
    public void offer(int data){
        pq.add(data);
    }
    public int poll(){
        return 0;

    }


}
