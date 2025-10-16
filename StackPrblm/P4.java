package MPushkar.StackPrblm;

import java.util.Collections;
import java.util.PriorityQueue;

public class P4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(7);
        pq.add(3);
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(6);
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
