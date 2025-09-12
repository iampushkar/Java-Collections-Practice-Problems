package MPushkar.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class P1234 {

    public static void main(String[] args) {
        //  ascending Order MIN Priority
           PriorityQueue<Integer> pq= new PriorityQueue<>();
        // PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> Integer.compare(b,a));

        //Descending Order  Max Priority PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        pq.add(6);
        pq.add(5);
        pq.add(3);
        pq.add(1);
        pq.add(7);
        pq.add(2);
        while(!pq.isEmpty()){
         System.out.println(pq.poll());
        }
        PriorityQueue<Character> pq1= new PriorityQueue<>((a,b)-> Character.compare(b,a));

        pq1.add('d');
        pq1.add('b');
        pq1.add('a');
        pq1.add('c');
        while(!pq1.isEmpty()){
            System.out.println("Character"+pq1.poll());
        }


    }
}
