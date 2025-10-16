package MPushkar.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class P2 {

    public static void main(String[] args) {
        //min priority que ascending order
        PriorityQueue<Integer> pq= new PriorityQueue<>((a, b)-> Integer.compare(a,b));


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
