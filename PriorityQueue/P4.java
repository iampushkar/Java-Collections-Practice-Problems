package MPushkar.PriorityQueue;

import java.util.PriorityQueue;

public class P4 {
    public static void main(String[] args) {
        PriorityQueue<Character> pq1= new PriorityQueue<>((a, b)-> Character.compare(b,a));

        pq1.add('d');
        pq1.add('b');
        pq1.add('a');
        pq1.add('c');
        while(!pq1.isEmpty()){
            System.out.println("Character"+pq1.poll());
        }
    }
}
