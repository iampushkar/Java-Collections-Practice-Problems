package MPushkar.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class P1 {
    public static void main(String[] args) {
        //  ascending Order MIN Priority
        //   PriorityQueue<Integer> pq = new PriorityQueue<>();


        //Descending Order  Max Priority
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        pq.add(6);
        pq.add(5);
        pq.add(3);
        pq.add(1);
        pq.add(7);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
