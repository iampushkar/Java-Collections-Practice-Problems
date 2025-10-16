package MPushkar.PriorityQueue;

import java.util.PriorityQueue;

public class P3 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> Integer.compare(b,a));
        //PriorityQueue<Integer> pq1= new PriorityQueue<>();
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
